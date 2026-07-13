package com.travelweather.controller;

import com.travelweather.model.Destination;
import com.travelweather.service.TravelService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TravelController {

    private final TravelService travelService;

    public TravelController(TravelService travelService) {
        this.travelService = travelService;
    }

    @GetMapping("/travel/recommendations")
    public List<Destination> getRecommendations() {
        return travelService.getRecommendedDestinations();
    }
}

