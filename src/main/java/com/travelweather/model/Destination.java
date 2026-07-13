package com.travelweather.model;

import java.util.List;

public class Destination {
    private String name;
    private String country;
    private String description;
    private double averageTemperature;
    private String budgetRange;
    private List<String> activities;
    private String travelStyle;
    private List<String> itinerary;

    public Destination(String name, String country, String description,
                       double averageTemperature, String budgetRange,
                       List<String> activities, String travelStyle,
                       List<String> itinerary) {

        this.name = name;
        this.country = country;
        this.description = description;
        this.averageTemperature = averageTemperature;
        this.budgetRange = budgetRange;
        this.activities = activities;
        this.travelStyle = travelStyle;
        this.itinerary = itinerary;
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

    public String getBudgetRange() {
        return budgetRange;
    }

    public List<String> getActivities() {
        return activities;
    }

    public String getTravelStyle() {
        return travelStyle;
    }

    public List<String> getItinerary() {
        return itinerary;
    }
}

