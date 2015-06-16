package com.cities;



public class City {
    private String name;
    private double width; 
    private double length;
    private boolean hasPort;
    private boolean hasAirport;

    public City(String name, double width, double length, boolean hasPort, boolean hasAirport) {
        this.name = name;
        this.width = width * 3.14 / 180;
        this.length = length * 3.14 / 180;
        this.hasPort = hasPort;
        this.hasAirport = hasAirport;
    }
// Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public boolean isHasPort() {
        return hasPort;
    }

    public void setHasPort(boolean hasPort) {
        this.hasPort = hasPort;
    }

    public boolean isHasAirport() {
        return hasAirport;
    }

    public void setHasAirport(boolean hasAirport) {
        this.hasAirport = hasAirport;
    }
}