package com.epam.lab.abstractFactory.factory;

import com.epam.lab.abstractFactory.model.*;

public class SportVehicleFactory implements VehicleFactory{

    @Override
    public Car createCar() {
        return new SportCar();
    }

    @Override
    public Motorcycle createMotorcycle() {
        return new SportMotorcycle();
    }
}



