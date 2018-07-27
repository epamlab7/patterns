package com.epam.lab.builder;

public class Car {

    String make;
    Transmission transmissin;
    int maxSpeed;

    public void setMake(String make) {
        this.make = make;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setTransmissin(Transmission transmissin) {
        this.transmissin = transmissin;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make = '" + make + '\'' +
                ", transmissin = " + transmissin +
                ", maxSpeed = " + maxSpeed +
                '}';
    }
}
