package com.travelweather.model;

public class Destination {
    private String name;
    private String country;
    private String description;
    private double averageTemperature;

    public Destination(String name, String country, String description, double averageTemperature) {
        this.name = name;
        this.country = country;
        this.description = description;
        this.averageTemperature = averageTemperature;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public String getDescription() {
        return description;
    }

    public double getAverageTemperature() {
        return averageTemperature;
    }
}

