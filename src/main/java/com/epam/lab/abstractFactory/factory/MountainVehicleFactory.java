package com.epam.lab.abstractFactory.factory;

import com.epam.lab.abstractFactory.model.Car;
import com.epam.lab.abstractFactory.model.Motorcycle;
import com.epam.lab.abstractFactory.model.MountainCar;
import com.epam.lab.abstractFactory.model.MountainMotorcycle;

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


