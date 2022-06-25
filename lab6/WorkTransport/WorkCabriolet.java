package com.company.lab6.WorkTransport;

import com.company.lab6.PassengerTransport.Cabriolet;

public class WorkCabriolet extends Cabriolet{
    private int Mileage;

    public WorkCabriolet() {
        super();
    }

    @Override
    public String getDescription() {
        return "This is civil Cabriolet. Mileage is " + this.Mileage + " km. Maximum of the speed is " +
                this.getMaxSpeed() + " km/h. People capacity is " + this.getPeopleCapacity() + " number. Color is "
                + this.getColor() + ". Car model is " + this.getCarModel() + ". FuelType is " + this.getFuelType()
                + ". EnginePower is " + this.getEnginePower() + " hp. ";
    }

    public WorkCabriolet(int MaxSpeed, int PeopleCapacity, String Color, String CarModel, String FuelType, int EnginePower,  int Mileage) {

        this.MaxSpeed = MaxSpeed;
        this.PeopleCapacity = PeopleCapacity;
        this.Color = Color;
        this.CarModel = CarModel;
        this.FuelType = FuelType;
        this.EnginePower = EnginePower;
        this.Mileage = Mileage;
    }
}