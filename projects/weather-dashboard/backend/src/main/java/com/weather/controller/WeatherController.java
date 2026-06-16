package com.weather.controller;

import com.weather.model.WeatherResponse;
import com.weather.service.WeatherService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/weather")
public class WeatherController {

    private final WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping
    public WeatherResponse getCurrentWeather(@RequestParam String city) {
        Object data = weatherService.getCurrentWeather(city);
        return new WeatherResponse(true, data, "Current weather fetched successfully.");
    }

    @GetMapping("/forecast")
    public WeatherResponse getForecast(@RequestParam String city) {
        Object data = weatherService.getForecast(city);
        return new WeatherResponse(true, data, "Forecast fetched successfully.");
    }
}
