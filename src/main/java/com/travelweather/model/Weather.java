package com.travelweather.model;

public class Weather {
    private String city;
    private double temperature;
    private String condition;

    public Weather(String city, double temperature, String condition) {
        this.city = city;
        this.temperature = temperature;
        this.condition = condition;
    }

    public String getCity() {
        return city;
    }

    public double getTemperature() {
        return temperature;
    }

    public String getCondition() {
        return condition;
    }
}
