package com.company.lab6.Factory;

import com.company.lab6.CargoTransport.Truck;
import com.company.lab6.CargoTransport.GasolineTanker;
import com.company.lab6.PassengerTransport.Cabriolet;
import com.company.lab6.PassengerTransport.Jeep;
import com.company.lab6.WorkTransport.WorkCabriolet;
import com.company.lab6.WorkTransport.WorkTruck;
import com.company.lab6.WorkTransport.WorkGasolineTanker;
import com.company.lab6.WorkTransport.WorkJeep;

import java.util.ArrayList;
import java.util.Random;

public class WorkTransportFactory implements TransportFactory {
    Random random = new Random();

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
    @Override
    public Truck createTruck() {
        return new WorkTruck(random.nextInt(120), random.nextInt(6), getRandomColor(), getRandomCarModel(),
                random.nextInt(1000), random.nextInt(5), random.nextInt(200));
    }
    @Override
    public GasolineTanker createGasolineTanker () {
        return new WorkGasolineTanker(random.nextInt(120), random.nextInt(6), getRandomColor(), getRandomCarModel(),
                random.nextInt(1000), random.nextInt(5), random.nextInt(200));
    }
    @Override
    public Cabriolet createCabriolet () {
        return new WorkCabriolet(random.nextInt(200), random.nextInt(8), getRandomColor(), getRandomCarModel(),
                getRandomFuelType(),random.nextInt(300), random.nextInt(100));
    }
    @Override
    public Jeep createJeep () {
        return new WorkJeep(random.nextInt(200), random.nextInt(8), getRandomColor(), getRandomCarModel(),
                getRandomFuelType(),random.nextInt(300), random.nextInt(100));
    }
}