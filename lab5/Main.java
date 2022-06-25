package com.company.lab5;

import com.company.lab5.CargoTransport.CargoTransport;
import com.company.lab5.PassengerTransport.PassengerTransport;
import com.company.lab5.Factory.CargoTransportFactory;
import com.company.lab5.Factory.PassengerTransportFactory;

public class Main {

    public static void main(String[] args) {
        //Первая Фабрика
        CargoTransportFactory cargoTransportFactory = new CargoTransportFactory();
        CargoTransport truck = CargoTransportFactory.createCargoTransport(TransportNames.TRUCK);
        CargoTransport gasolinetanker = cargoTransportFactory.createCargoTransport(TransportNames.GASOLINETANKER);
        System.out.println(truck.getDescription());
        System.out.println(gasolinetanker.getDescription());

        //Вторая Фабрика
        PassengerTransportFactory passengerTransportFactory = new PassengerTransportFactory();
        PassengerTransport jeep = passengerTransportFactory.createPassengerTransport(TransportNames.JEEP);
        PassengerTransport cabriolet = passengerTransportFactory.createPassengerTransport(TransportNames.CABRIOLET);
        System.out.println(jeep.getDescription());
        System.out.println(cabriolet.getDescription());
    }
}
