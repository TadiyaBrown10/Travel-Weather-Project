package com.travelweather.model;

public class TravelDetails {
    private Destination destination;
    private Weather weather;

    public TravelDetails(Destination destination, Weather weather) {
        this.destination = destination;
        this.weather = weather;
    }

    public Destination getDestination() {
        return destination;
    }

    public Weather getWeather() {
        return weather;
    }
}

