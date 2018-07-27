package com.epam.lab.builder;

abstract class CarBuilder {
    Car car;

    void createCar() {car = new Car();}

    abstract void buildMake ();
    abstract void buildTransmissin();
    abstract void buildMaxSpeed();

    Car getCar(){return car;}
}
