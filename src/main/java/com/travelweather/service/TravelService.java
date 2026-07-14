package com.travelweather.service;

import com.travelweather.model.Destination;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TravelService {

    public List<Destination> getRecommendedDestinations() {
        List<Destination> destinations = new ArrayList<>();

        destinations.add(new Destination(
                "Tokyo",
                "Japan",
                "A vibrant city with amazing food and culture.",
                68.0
        ));

        destinations.add(new Destination(
                "Paris",
                "France",
                "Romantic city with iconic landmarks and art.",
                70.0
        ));

        destinations.add(new Destination(
                "Cancun",
                "Mexico",
                "Beautiful beaches and warm weather.",
                85.0
        ));

        return destinations;
    }

    public Destination addDestination(Destination destination) {
        return destination;
    }

    public Destination updateDestination(Destination destination) {
        return destination;
    }

    public String deleteDestination() {
        return "Destination deleted.";
    }


}

