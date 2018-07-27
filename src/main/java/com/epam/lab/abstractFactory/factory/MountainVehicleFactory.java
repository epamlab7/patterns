package com.epam.factory;

import com.epam.model.*;

public class MountainVehicleFactory implements VehicleFactory {

    @Override
    public Car createCar() {
        return new MountainCar();
    }

    @Override
    public Motorcycle createMotorcycle() {
        return new MountainMotorcycle();
    }
}


