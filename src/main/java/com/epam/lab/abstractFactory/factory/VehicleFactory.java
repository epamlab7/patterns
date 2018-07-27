package com.epam.lab.abstractFactory.factory;

import com.epam.lab.abstractFactory.model.Car;
import com.epam.lab.abstractFactory.model.Motorcycle;

public interface VehicleFactory {

    Car createCar();

    Motorcycle createMotorcycle();

}






