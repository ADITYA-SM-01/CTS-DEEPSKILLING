package com.library;

public class WeatherService {

    private ExternalAPI api;

    public WeatherService(ExternalAPI api) {
        this.api = api;
    }

    public String fetchWeather() {
        return api.getWeather();
    }

}