package com.transport.sea;

import com.logistic.ComfortClass;
import com.transport.Sea;

public class Boat extends Sea {

    private ComfortClass comfortClass;

    public Boat(int taxPerKm, int speed, double volume, int passengers, ComfortClass comfortClass) {
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
        return "Boat [comfortClass=" + comfortClass
                + ", taxPerKm=" + taxPerKm
                + ", speed=" + speed
                + ", volume=" + volume
                + ", passengers=" + passengers
                + "]";
    }
}