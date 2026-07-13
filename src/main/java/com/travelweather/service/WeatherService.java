package com.travelweather.service;

import com.travelweather.model.Weather;
import org.springframework.stereotype.Service;

@Service
public class WeatherService {

    public Weather getWeatherForCity(String city) {
        // for now return fake data until we have a real API
        return new Weather(city, 72.5, "Sunny");
    }
}
