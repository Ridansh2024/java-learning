package com.weather.controller;

import com.weather.exception.CityNotFoundException;
import com.weather.exception.WeatherApiException;
import com.weather.model.WeatherResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(CityNotFoundException.class)
    public ResponseEntity<WeatherResponse> handleCityNotFound(CityNotFoundException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(new WeatherResponse(false, null, ex.getMessage()));
    }

    @ExceptionHandler(WeatherApiException.class)
    public ResponseEntity<WeatherResponse> handleWeatherApiError(WeatherApiException ex) {
        return ResponseEntity.status(HttpStatus.BAD_GATEWAY)
                .body(new WeatherResponse(false, null, ex.getMessage()));
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<WeatherResponse> handleGenericError(Exception ex) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(new WeatherResponse(false, null, "Unexpected error occurred."));
    }
}
