package com.travelweather.controller;

import com.travelweather.model.Destination;
import com.travelweather.service.TravelService;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/travel/newplace")
    public Destination addDestination(@RequestBody Destination destination) {
        return travelService.addDestination(destination);

    }

    @PutMapping("/travel/update")
    public Destination updateDestination(@RequestBody Destination destination) {
        return travelService.updateDestination(destination);
    }

    @DeleteMapping("/travel/delete")
    public String deleteDestination() {
        return travelService.deleteDestination();
    }



}

