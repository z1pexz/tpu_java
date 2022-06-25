package com.company.lab6;

import com.company.lab6.CargoTransport.Truck;
import com.company.lab6.CargoTransport.GasolineTanker;
import com.company.lab6.PassengerTransport.Jeep;
import com.company.lab6.PassengerTransport.Cabriolet;
import com.company.lab6.Factory.CivilTransportFactory;
import com.company.lab6.Factory.WorkTransportFactory;
import com.company.lab6.Factory.TransportFactory;

public class Main {

    public static void main(String[] args) {
        //Work
        TransportFactory TransportFactory = getTransportFactory(TransportTypes.WORK);
        Jeep jeep = TransportFactory.createJeep();
        Cabriolet cabriolet = TransportFactory.createCabriolet();
        Truck truck = TransportFactory.createTruck();
        GasolineTanker gasolineTanker = TransportFactory.createGasolineTanker();

        System.out.println(jeep.getDescription());
        System.out.println(cabriolet.getDescription());
        System.out.println(truck.getDescription());
        System.out.println(gasolineTanker.getDescription());


        //Civil
        TransportFactory = getTransportFactory(TransportTypes.CIVIL);
        jeep = TransportFactory.createJeep();
        cabriolet = TransportFactory.createCabriolet();
        truck = TransportFactory.createTruck();
        gasolineTanker = TransportFactory.createGasolineTanker();

        System.out.println(jeep.getDescription());
        System.out.println(cabriolet.getDescription());
        System.out.println(truck.getDescription());
        System.out.println(gasolineTanker.getDescription());
    }

    public static TransportFactory getTransportFactory(TransportTypes transportType) {
        if (transportType == TransportTypes.WORK) {
            return new WorkTransportFactory();
        }
        else if (transportType == TransportTypes.CIVIL) {
            return new CivilTransportFactory();
        }
        return null;
    }
}