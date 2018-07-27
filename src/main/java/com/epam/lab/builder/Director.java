package com.epam.lab.builder;

public class Director {

    CarBuilder builder;

    public void setBuilder(CarBuilder b) {
        builder = b;
    }

    Car buildCar(){
        builder.createCar();
        builder.buildMake();
        builder.buildTransmissin();
        builder.buildMaxSpeed();

        Car car = builder.getCar();
        return car;
    }
}
