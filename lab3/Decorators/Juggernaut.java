package com.company.lab3.Decorators;

import com.company.lab3.Truck;

public class Juggernaut extends Decorator{
    private Truck truck;
    public Juggernaut(Truck truck) {
        this.truck = truck;
    }
    public String getDescription() {
        return "This is Juggernaut. Volume of the tank is " + this.truck.VolumeTank + " liter. Maximum of the speed is " +
                this.truck.getMaxSpeed() + " km/h. People capacity is " + this.truck.getPeopleCapacity() + " numbers. Color is "
                + this.truck.getColor() + ". Car model is " + this.truck.getCarModel() + ". Max load is " + this.truck.getMaxLoad()*3
                + " tons. Number of trailers is " + this.truck.getNumberOfTrailers() + " numbers. ";
    }
}
