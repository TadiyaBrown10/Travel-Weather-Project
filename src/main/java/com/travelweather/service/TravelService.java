package com.travelweather.service;

import org.springframework.stereotype.Service;
import com.travelweather.model.Destination;
import com.travelweather.model.Weather;
import com.travelweather.model.TravelDetails;

import java.util.ArrayList;
import java.util.List;

@Service
public class TravelService {

    private final WeatherService weatherService;

    public TravelService(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    public List<Destination> getRecommendedDestinations() {
        List<Destination> destinations = new ArrayList<>();

        destinations.add(new Destination(
                "Tokyo",
                "Japan",
                "A vibrant city with amazing food and culture.",
                68.0,
                "$1500 - $2500",
                List.of("Food tours", "Temples", "Shopping"),
                "Urban",
                List.of("Day 1: Shibuya", "Day 2: Asakusa", "Day 3: Akihabara")
        ));

        destinations.add(new Destination(
                "Paris",
                "France",
                "Romantic city with iconic landmarks and art.",
                70.0,
                "$1800 - $3000",
                List.of("Museums", "Cafes", "Landmarks"),
                "Romantic",
                List.of("Day 1: Eiffel Tower", "Day 2: Louvre", "Day 3: Montmartre")
        ));

        destinations.add(new Destination(
                "Cancun",
                "Mexico",
                "Beautiful beaches and warm weather.",
                85.0,
                "$1200 - $2000",
                List.of("Beach", "Snorkeling", "Nightlife"),
                "Relax",
                List.of("Day 1: Beach Day", "Day 2: Snorkeling", "Day 3: Night Life")
        ));

        return destinations;
    }

    public List<Destination> getDestinationsWithGoodWeather() {
        List<Destination> all = getRecommendedDestinations();
        List<Destination> good = new ArrayList<>();

        for (Destination d : all) {
            Weather w = weatherService.getWeatherForCity(d.getName());

            if (w.getTemperature() >= 65 && w.getTemperature() <= 85) {
                good.add(d);
            }
        }

        return good;
    }

    public TravelDetails getDetails(String city) {
        Destination destination = getRecommendedDestinations()
                .stream()
                .filter(d -> d.getName().equalsIgnoreCase(city))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Destination not found"));

        Weather weather = weatherService.getWeatherForCity(city);

        return new TravelDetails(destination, weather);
    }
}

