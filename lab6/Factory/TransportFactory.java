package com.company.lab6.Factory;

import com.company.lab6.PassengerTransport.Cabriolet;
import com.company.lab6.PassengerTransport.Jeep;
import com.company.lab6.CargoTransport.Truck;
import com.company.lab6.CargoTransport.GasolineTanker;

public interface TransportFactory {
    Jeep createJeep();

    Cabriolet createCabriolet();

    GasolineTanker createGasolineTanker();

    Truck createTruck();
}