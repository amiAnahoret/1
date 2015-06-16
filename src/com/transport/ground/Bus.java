package com.transport.ground;

import com.logistic.ComfortClass;
import com.transport.Ground;

public class Bus extends Ground {
    private ComfortClass comfortClass;

    public Bus (int taxPerKm, int speed, double volume, int passengers, ComfortClass comfortClass){
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
        return "Bus [comfortClass=" + comfortClass
                + ", taxPerKm=" + taxPerKm
                + ", speed=" + speed + ", volume=" + volume + ", passengers="
                + passengers + "]";
    }



}

