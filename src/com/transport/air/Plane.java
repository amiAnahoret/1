package com.transport.air;

import com.logistic.ComfortClass;
import com.transport.Air;

public class Plane extends Air {
    private ComfortClass comfortClass;

    public Plane(int taxPerKm, int speed, double volume, int passengers, ComfortClass comfortClass) {
        super(taxPerKm, speed, volume, passengers);
        this.comfortClass = comfortClass;

    }

    public ComfortClass getComfortClass() {
        return comfortClass;
    }

    public void setComfortClass(ComfortClass comfortClass) {
        this.comfortClass = comfortClass;
    }

    @Override
    public String toString() {
        return "Plane [comfortClass=" + comfortClass
                + ", taxPerKm=" + taxPerKm
                + ", speed=" + speed
                + ", volume=" + volume
                + ", passengers=" + passengers
                + "]";
    }
}