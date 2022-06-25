package com.company.lab5.Factory;

import com.company.lab5.CargoTransport.*;
import com.company.lab5.CargoTransport.Truck;
import com.company.lab5.CargoTransport.GasolineTanker;
import com.company.lab5.TransportNames;

import java.util.ArrayList;
import java.util.Random;

public class CargoTransportFactory {
    public static CargoTransport createCargoTransport(TransportNames transportName) {
        Random random = new Random();
        if (transportName == null) {
            return null;
        } else if (transportName == TransportNames.TRUCK) {
            return new Truck(random.nextInt(120), random.nextInt(6), getRandomColor(), getRandomCarModel(),
                    random.nextInt(1000), random.nextInt(5), random.nextInt(200));

        } else if (transportName == TransportNames.GASOLINETANKER) {
            return new GasolineTanker(random.nextInt(120), random.nextInt(6), getRandomColor(), getRandomCarModel(),
                    random.nextInt(1000), random.nextInt(5), random.nextInt(200));
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
