package com.company.lab5;

public abstract class Transport {
    public int MaxSpeed;
    public int PeopleCapacity;
    public String Color;
    public String CarModel;


    public String getDescription() {
        return "This is transport class" ;
    }

    public Transport() {

    }

    public Transport(int MaxSpeed, int PeopleCapacity, String Color, String CarModel) {
        this.MaxSpeed = MaxSpeed;
        this.PeopleCapacity = PeopleCapacity;
        this.Color = Color;
        this.CarModel = CarModel;
    }
    public int getMaxSpeed() {
        return MaxSpeed;
    }
    public void setMaxSpeed(int MaxSpeed) {
        this.MaxSpeed = MaxSpeed;
    }

    public int getPeopleCapacity() {
        return PeopleCapacity;
    }
    public void setPeopleCapacity(int PeopleCapacity) {
        this.PeopleCapacity = PeopleCapacity;
    }

    public String getColor() {
        return Color;
    }
    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getCarModel() {
        return CarModel;
    }
    public void setCarModel(String CarModel) {
        this.CarModel = CarModel;
    }
}
