package com.company.lab3;

abstract class PassengerTransport extends Transport {
    public String FuelType;
    public int EnginePower;

    public PassengerTransport() {
        super();
    }

    @Override
    String getDescription() {
        return "This is Passenger Transport Class ";
    }
    public int getEnginePower() {
        return EnginePower;
    }
    public void setEnginePower(int EnginePower) {
        this.EnginePower = EnginePower;
    }
    public String getFuelType() {
        return FuelType;
    }
    public void setFuelType(String FuelType) {
        this.FuelType = FuelType;
    }
    public PassengerTransport(int MaxSpeed, int PeopleCapacity, String Color, String CarModel, String FuelType, int EnginePower) {
        this.MaxSpeed = MaxSpeed;
        this.PeopleCapacity = PeopleCapacity;
        this.Color = Color;
        this.CarModel = CarModel;
        this.FuelType = FuelType;
        this.EnginePower = EnginePower;
    }
}
