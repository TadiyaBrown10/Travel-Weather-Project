package com.travelweather.service;

import com.travelweather.model.Weather;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class WeatherService {

    @Value("${weather.api.key}")
    private String apiKey;

    @Value("${weather.api.url}")
    private String apiUrl;

    public Weather getWeatherForCity(String city) {
        String url = apiUrl + "?q=" + city + "&appid=" + apiKey + "&units=imperial";

        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject(url, String.class);

        try {
            ObjectMapper mapper = new ObjectMapper();
            JsonNode json = mapper.readTree(response);

            double temp = json.get("main").get("temp").asDouble();
            String condition = json.get("weather").get(0).get("description").asText();

            return new Weather(city, temp, condition);

        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to parse weather API response");
        }
    }
}

