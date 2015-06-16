package com.transport.ground;

import com.transport.Ground;

public class Truck extends Ground {
    private boolean hasTrailer;

    public Truck (int taxPerKm, int speed, double volume, int passengers, boolean trailer) {
        super(taxPerKm, speed, volume, passengers);
        this.hasTrailer = trailer;
    }
    public boolean isHasTrailer() {
        return hasTrailer;
    }

    public void setHasTrailer(boolean hasTrailer) {
        this.hasTrailer = hasTrailer;
    }

    @Override
    public String toString() {
        return "Truck [hasTrailer=" + hasTrailer
                + ", taxPerKm=" + taxPerKm
                + ", speed=" + speed
                + ", volume=" + volume
                + ", passengers=" + passengers
                + "]";
    }
}
