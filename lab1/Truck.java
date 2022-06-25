package com.company.lab1;

public class Truck extends CargoTransport {
    private int VolumeTank;

    public Truck() {
        super();
    }

    @Override
    String getDescription() {
        return "This is Truck. Volume of the tank is " + this.VolumeTank + " liter. Maximum of the speed is " +
                this.getMaxSpeed() + " km/h. People capacity is " + this.getPeopleCapacity() + " numbers. Color is "
                + this.getColor() + ". Car model is " + this.getCarModel() + ". Max load is " + this.getMaxLoad()
                + " tons. Number of trailers is " + this.getNumberOfTrailers() + " numbers. ";
    }

    public Truck(int MaxSpeed, int PeopleCapacity, String Color, String CarModel, int MaxLoad, int NumberOfTrailers, int VolumeTank) {

        this.MaxSpeed = MaxSpeed;
        this.PeopleCapacity = PeopleCapacity;
        this.Color = Color;
        this.CarModel = CarModel;
        this.MaxLoad = MaxLoad;
        this.NumberOfTrailers = NumberOfTrailers;
        this.VolumeTank = VolumeTank;
    }
}