package com.epam.factory;

import com.epam.model.*;

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



