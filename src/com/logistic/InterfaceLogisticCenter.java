package com.logistic;

import com.cities.City;
import com.transport.Transport;

import java.util.List;

public interface InterfaceLogisticCenter {

    public List<Transport> createTransport();

    public List<City> createCities();
}

