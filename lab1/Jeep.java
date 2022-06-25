package com.company.lab1;


public class Jeep extends PassengerTransport {
    private int Mileage;

    public Jeep() {
        super();
    }

    @Override
    String getDescription() {
        return "This is Jeep. Mileage is " + this.Mileage + " km. Maximum of the speed is " +
                this.getMaxSpeed() + " km/h. People capacity is " + this.getPeopleCapacity() + " number. Color is "
                + this.getColor() + ". Car model is " + this.getCarModel() + ". FuelType is " + this.getFuelType()
                + ". EnginePower is " + this.getEnginePower() + " hp. ";
    }

    public Jeep(int MaxSpeed, int PeopleCapacity, String Color, String CarModel, String FuelType, int EnginePower,  int Mileage) {

        this.MaxSpeed = MaxSpeed;
        this.PeopleCapacity = PeopleCapacity;
        this.Color = Color;
        this.CarModel = CarModel;
        this.FuelType = FuelType;
        this.EnginePower = EnginePower;
        this.Mileage = Mileage;
    }
}