package com.company.lab1;

abstract class CargoTransport extends Transport {
    public int MaxLoad;
    public int NumberOfTrailers;

    public CargoTransport() {
        super();
    }

    @Override
    String getDescription() {
        return "This is Cargo transport class ";
    }

    public int getMaxLoad() {
        return MaxLoad;
    }

    public void setMaxLoad(int MaxLoad) {
        this.MaxLoad = MaxLoad;
    }

    public int getNumberOfTrailers() {
        return NumberOfTrailers;
    }

    public void setNumberOfTrailers(int NumberOfTrailers) {
        this.NumberOfTrailers = NumberOfTrailers;
    }
    public CargoTransport(int MaxSpeed, int PeopleCapacity, String Color, String CarModel, int MaxLoad, int NumberOfTrailers) {
        this.MaxSpeed = MaxSpeed;
        this.PeopleCapacity = PeopleCapacity;
        this.Color = Color;
        this.CarModel = CarModel;
        this.MaxLoad = MaxLoad;
        this.NumberOfTrailers = NumberOfTrailers;
    }
}
