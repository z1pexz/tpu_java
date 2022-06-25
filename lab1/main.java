package com.company.lab1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class main {

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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Enter the number of objects to generate: ");
        int NumberOfObject = scanner.nextInt();
        ArrayList<Transport> TransportArrayList = new ArrayList<>();

        for (int i = 0; i < NumberOfObject; i++) {
            if (random.nextInt(2)==0) {
                TransportArrayList.add(new Truck(random.nextInt(120), random.nextInt(6), getRandomColor(), getRandomCarModel(),
                        random.nextInt(1000), random.nextInt(5), random.nextInt(200)));
            }
            else {
                TransportArrayList.add(new Jeep(random.nextInt(200), random.nextInt(8), getRandomColor(), getRandomCarModel(),
                        getRandomFuelType(),random.nextInt(300), random.nextInt(100)));
            }
        }
        for (int i= 0; i<TransportArrayList.size();i++ ) {
            System.out.println(TransportArrayList.get(i).getDescription());
        }
    }
}

