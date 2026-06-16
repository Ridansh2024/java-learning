package com.weather.service;

import com.weather.exception.CityNotFoundException;
import com.weather.exception.WeatherApiException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

    private static final String WEATHER_URL = "https://api.openweathermap.org/data/2.5/weather?q=%s&appid=%s&units=metric";
    private static final String FORECAST_URL = "https://api.openweathermap.org/data/2.5/forecast?q=%s&appid=%s&units=metric";

    private final RestTemplate restTemplate;

    @Value("${openweather.api.key}")
    private String apiKey;

    public WeatherService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Object getCurrentWeather(String city) {
        return callApi(String.format(WEATHER_URL, city, apiKey));
    }

    public Object getForecast(String city) {
        return callApi(String.format(FORECAST_URL, city, apiKey));
    }

    private Object callApi(String url) {
        try {
            ResponseEntity<Object> response = restTemplate.getForEntity(url, Object.class);
            return response.getBody();
        } catch (HttpClientErrorException.NotFound ex) {
            throw new CityNotFoundException("City not found.");
        } catch (HttpClientErrorException ex) {
            throw new WeatherApiException("Weather API returned an error: " + ex.getStatusCode());
        } catch (Exception ex) {
            throw new WeatherApiException("Failed to fetch weather data.");
        }
    }
}
