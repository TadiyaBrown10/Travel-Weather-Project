package com.travelweather.travelweather.model;

public class Destination {
    private String city;
    private String country;
    private String weather;
    private String activity;
    private double estimateBudget;

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getWeather() {
        return weather;
    }
    public void setWeather(String weather) {

        this.weather = weather;
    }
    public String getActivity() {
        return activity;
    }
    public void setActivity(String activity) {
        this.activity = activity;
    }
    public double getEstimateBudget() {
        return estimateBudget;

    }
    public void setEstimateBudget(double estimateBudget) {
        this.estimateBudget = estimateBudget;
    }

    public Destination() {
    }
    public Destination(String city, String country, String weather,
                       String activity, double estimateBudget)
    {
        this.city = city;
        this.country = country;
        this.weather = weather;
        this.activity = activity;
        this.estimateBudget = estimateBudget;

    }

    @Override
    public String toString() {
        return "Destination{" +
                "city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", weather='" + weather + '\'' +
                ", activity='" + activity + '\'' +
                ", estimateBudget=" + estimateBudget +
                '}';
    }
}