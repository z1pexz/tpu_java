package com.company.lab5.PassengerTransport;

public class Cabriolet extends PassengerTransport {
    private int Mileage;

    public Cabriolet() {
        super();
    }

    @Override
    public String getDescription() {
        return "This is Cabriolet. Mileage is " + this.Mileage + " km. Maximum of the speed is " +
                this.getMaxSpeed() + " km/h. People capacity is " + this.getPeopleCapacity() + " number. Color is "
                + this.getColor() + ". Car model is " + this.getCarModel() + ". FuelType is " + this.getFuelType()
                + ". EnginePower is " + this.getEnginePower() + " hp. ";
    }

    public Cabriolet(int MaxSpeed, int PeopleCapacity, String Color, String CarModel, String FuelType, int EnginePower,  int Mileage) {

        this.MaxSpeed = MaxSpeed;
        this.PeopleCapacity = PeopleCapacity;
        this.Color = Color;
        this.CarModel = CarModel;
        this.FuelType = FuelType;
        this.EnginePower = EnginePower;
        this.Mileage = Mileage;
    }
}