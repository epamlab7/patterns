package com.epam.lab.builder;

public class MitsubishiBuilder extends CarBuilder {

    void buildMake() {
        car.setMake("Mitsubishi Lancer");
    }

    void buildTransmissin() {
        car.setTransmissin(Transmission.AUTO);
    }

    void buildMaxSpeed() {
        car.setMaxSpeed(320);
    }
}
