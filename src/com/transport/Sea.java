package com.transport;

public abstract class Sea extends Transport {
    public Sea(int taxPerKm, int speed, double volume, int passengers) {
        super(taxPerKm, speed, volume, passengers);
    }
}
