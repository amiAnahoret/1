package com.transport;

import com.logistic.ComfortClass;

public abstract class Transport {
    public int taxPerKm;
    public int speed;
    public double volume;
    public int passengers;
    public ComfortClass comfortClass;
    public Transport() {

    }

    public Transport(int taxPerKm, int speed, double volume, int passengers) {

        this.taxPerKm = taxPerKm;
        this.speed = speed;
        this.volume = volume;
        this.passengers = passengers;
    }

    public int getTaxPerKm() {
        return (int) taxPerKm;
    }

    public void setTaxPerKm(int taxPerKm) {
        this.taxPerKm = taxPerKm;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }







}
