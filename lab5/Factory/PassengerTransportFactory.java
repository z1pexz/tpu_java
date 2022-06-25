package com.company.lab5.Factory;

import com.company.lab5.PassengerTransport.*;
import com.company.lab5.PassengerTransport.Cabriolet;
import com.company.lab5.PassengerTransport.Jeep;
import com.company.lab5.TransportNames;

import java.util.ArrayList;
import java.util.Random;

public class PassengerTransportFactory {
    public PassengerTransport createPassengerTransport(TransportNames transportName) {
        Random random = new Random();
        if (transportName == null) {
            return null;
        } else if (transportName == TransportNames.JEEP) {
            return new Jeep(random.nextInt(200), random.nextInt(8), getRandomColor(), getRandomCarModel(),
                    getRandomFuelType(), random.nextInt(300), random.nextInt(100));

        } else if (transportName == TransportNames.CABRIOLET) {
            return new Cabriolet(random.nextInt(200), random.nextInt(8), getRandomColor(), getRandomCarModel(),
                    getRandomFuelType(), random.nextInt(300), random.nextInt(100));
        }
        return null;
    }

    static String getRandomColor() {
        ArrayList<String> ListOfColors = new ArrayList<String>();
        ListOfColors.add("Black");
        ListOfColors.add("White");
        ListOfColors.add("Yellow");
        return ListOfColors.get(new Random().nextInt(3));
    }

    static String getRandomCarModel() {
        ArrayList<String> ListOfModels = new ArrayList<String>();
        ListOfModels.add("Suzuki");
        ListOfModels.add("Volvo");
        ListOfModels.add("Mercedes");
        return ListOfModels.get(new Random().nextInt(3));
    }

    static String getRandomFuelType() {
        ArrayList<String> ListOfFuel = new ArrayList<String>();
        ListOfFuel.add("Petrol");
        ListOfFuel.add("Solar");
        ListOfFuel.add("Diesel");
        return ListOfFuel.get(new Random().nextInt(3));
    }
}