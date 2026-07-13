package com.travelweather.service;

import com.travelweather.model.Weather;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.client.HttpClientErrorException;

@Service
public class WeatherService {

    @Value("c5a38b3264d98fcd5d9765808b3cdee4")
    private String apiKey;

    @Value("https://api.openweathermap.org/data/2.5/weather")
    private String apiUrl;

    public Weather getWeatherForCity(String city) {
        String url = apiUrl + "?q=" + city + "&appid=" + apiKey + "&units=imperial";

        System.out.println("FINAL URL = " + url);

        RestTemplate restTemplate = new RestTemplate();

        try {
            String response = restTemplate.getForObject(url, String.class);

            ObjectMapper mapper = new ObjectMapper();
            JsonNode json = mapper.readTree(response);

            double temp = json.get("main").get("temp").asDouble();
            String condition = json.get("weather").get(0).get("description").asText();

            return new Weather(city, temp, condition);

        } catch (HttpClientErrorException e) {
            throw new RuntimeException("Weather API error: " + e.getStatusCode());
        } catch (Exception e) {
            throw new RuntimeException("Failed to process weather data");
        }
    }
}
