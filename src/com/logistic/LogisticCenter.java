package com.logistic;

import com.cities.City;
import com.transport.*;
import com.transport.ground.*;
import com.transport.air.*;
import com.transport.sea.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LogisticCenter implements InterfaceLogisticCenter {
    private List<Transport> transport;
    private List<City> cities;

    public LogisticCenter() {
        transport = createTransport();
        cities = createCities();
    }


    public List<Transport> createTransport() {
        List<Transport> tempTransport = new ArrayList<Transport>();
        tempTransport.add(new Bus(5, 17, 60, 115, ComfortClass.BUSSINESS));
        //tempTransport.add(new Truck(3, 110, 20, 3, true));
        tempTransport.add(new Boat(2, 60, 140, 5, ComfortClass.ECONOM));
        tempTransport.add(new Ship(5, 80, 5, 60, ComfortClass.BUSSINESS));
        tempTransport.add(new Plane(6, 600, 2, 40, ComfortClass.BUSSINESS));
        tempTransport.add(new Plane(3, 400, 2, 40, ComfortClass.ECONOM));
        return tempTransport;
    }

    public List<City> createCities() {
        List<City> tempCity = new ArrayList<City>();
        tempCity.add(new City("Moscow", 55.752, 37.615, false, true));
        tempCity.add(new City("SPB", 59.894, 30.264, true, true));
        tempCity.add(new City("Minsk", 53.900, 27.566, true, true));
        tempCity.add(new City("Paris", 48.853, 2.348, true, true));
        tempCity.add(new City("Salzburg", 47.799, 13.043, true, true));
        return tempCity;
    }
    public double calcCityDistance(City startCirt, City endCity) {
        final int EARTH_RADIUS = 6372795;
        double cosLatitStart = Math.cos(startCirt.getWidth());
        double cosLatitFinish = Math.cos(endCity.getWidth());
        double sinLatitStart = Math.sin(startCirt.getWidth());
        double sinLatitFinish = Math.sin(endCity.getWidth());
        double delta = endCity.getLength() - startCirt.getLength();
        double cosDelta = Math.cos(delta);
        double sinDelta = Math.sin(delta);
        double x = Math.sqrt(Math.pow(cosLatitFinish * sinDelta, 2) + Math.pow(cosLatitStart * sinLatitFinish - sinLatitStart * cosLatitFinish * cosDelta, 2));
        double y = sinLatitStart * sinLatitFinish + cosLatitStart * cosLatitFinish * cosDelta;
        double temp = Math.atan2(x, y);
        double dist = temp * EARTH_RADIUS;
        return dist / 1000;
    }


    public List<Transport> loadTransport(int passengers, int volume) {
        Iterator<Transport> transportIterator = createTransport().iterator();
        List<Transport> tempTransport = new ArrayList<Transport>();
        Transport transportValue;
        while (transportIterator.hasNext()) {
            transportValue = transportIterator.next();
            if (passengers <= transportValue.getPassengers() && volume <= transportValue.getVolume()) {
                tempTransport.add(transportValue);
            }
        }

        System.out.println("After loading");
        System.out.println();
        for (Transport outputTransport : tempTransport) {
            System.out.println(outputTransport.toString());
        }

        return tempTransport;
    }

    public List<Transport> checkAccessibility(City startCity, City endCity) {
        Iterator<Transport> transportIterator = loadTransport(1, 1).iterator();
        List<Transport> tempTransport = new ArrayList<Transport>();
        Transport transportValue;
        ///
        System.out.println();
        System.out.println("Distance between " + startCity.getName() + " & " + endCity.getName() + " - " + calcCityDistance(startCity, endCity) + " km");
        ///
        while (transportIterator.hasNext()) {
            transportValue = transportIterator.next();
            if ((transportValue instanceof Air) && (startCity.isHasAirport() && endCity.isHasAirport())) {
                tempTransport.add(transportValue);
            } else if ((transportValue instanceof Sea) && (startCity.isHasPort() && endCity.isHasPort())) {
                tempTransport.add(transportValue);
            }
        }

        System.out.println();
        System.out.println("After checking");
        System.out.println();
        for (Transport outputTransport : tempTransport) {
            System.out.println(outputTransport.toString());
        }
        System.out.println("The fastest transport: " + getTheFastestTransport(tempTransport));
        System.out.println("The cheapest transport: " + getTheCheapestTransport(tempTransport));

        return tempTransport;
    }

    public Transport getTheFastestTransport(List<Transport> transport) {
        Iterator<Transport> transportIterator = transport.iterator();
        Transport transportValue;
        Transport theFastestTransport = null;
        int max = 0;
        while (transportIterator.hasNext()) {
            transportValue = transportIterator.next();
            if (max < transportValue.getSpeed()) {
                max = transportValue.getSpeed();
                theFastestTransport = transportValue;
            }
        }
        return theFastestTransport;
    }

    public Transport getTheCheapestTransport(List<Transport> transport) {
        Iterator<Transport> transportIterator = transport.iterator();
        Transport transportValue;
        Transport theCheapestTransport = null;
        int min = transport.get(0).getTaxPerKm();
        while (transportIterator.hasNext()) {
            transportValue = transportIterator.next();
            if (min > transportValue.getTaxPerKm()) {
                min = transportValue.getTaxPerKm();
                theCheapestTransport = transportValue;
            }
        }
        return theCheapestTransport;
    }

    public List<Transport> getTransport() {
        return transport;
    }

    public void setTransport(List<Transport> transport) {
        this.transport = transport;
    }


    public List<City> getCities() {
        return cities;
    }


    public void setCities(List<City> cities) {
        this.cities = cities;
    }


}