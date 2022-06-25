package com.company.lab6.CivilTransport;

import com.company.lab6.CargoTransport.Truck;

public class CivilTruck extends Truck {
    private int VolumeTank;

    public CivilTruck() {
        super();
    }

    @Override
    public String getDescription() {
        return "This is civil Truck. Volume of the tank is " + this.VolumeTank + " liter. Maximum of the speed is " +
                this.getMaxSpeed() + " km/h. People capacity is " + this.getPeopleCapacity() + " numbers. Color is "
                + this.getColor() + ". Car model is " + this.getCarModel() + ". Max load is " + this.getMaxLoad()
                + " tons. Number of trailers is " + this.getNumberOfTrailers() + " numbers. ";
    }

    public CivilTruck(int MaxSpeed, int PeopleCapacity, String Color, String CarModel, int MaxLoad, int NumberOfTrailers, int VolumeTank) {

        this.MaxSpeed = MaxSpeed;
        this.PeopleCapacity = PeopleCapacity;
        this.Color = Color;
        this.CarModel = CarModel;
        this.MaxLoad = MaxLoad;
        this.NumberOfTrailers = NumberOfTrailers;
        this.VolumeTank = VolumeTank;
    }
}