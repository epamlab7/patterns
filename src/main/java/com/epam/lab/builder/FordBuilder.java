package com.epam.lab.builder;

public class FordBuilder extends CarBuilder {
    void buildMake() {
        car.setMake("Ford Mondeo");
    }

    void buildTransmissin() {
        car.setTransmissin(Transmission.MANUAL);
    }

    void buildMaxSpeed() {
        car.setMaxSpeed(260);
    }
}
