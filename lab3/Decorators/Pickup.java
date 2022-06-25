package com.company.lab3.Decorators;

import com.company.lab3.Jeep;

public class Pickup extends Decorator {
    private Jeep jeep;
    public Pickup(Jeep jeep) {
        this.jeep =jeep;
    }
    public String getDescription() {
        return "This is Pickup. Mileage is " + this.jeep.Mileage + " km. Maximum of the speed is " +
                this.jeep.getMaxSpeed() + " km/h. People capacity is " + this.jeep.getPeopleCapacity()*2 + " number. Color is "
                + this.jeep.getColor() + ". Car model is " + this.jeep.getCarModel() + ". FuelType is " + this.jeep.getFuelType()
                + ". EnginePower is " + this.jeep.getEnginePower()*2 + " hp. ";
    }
}
