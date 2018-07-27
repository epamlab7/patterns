package com.epam.factory;

import com.epam.model.Bicycle;
import com.epam.model.Car;
import com.epam.model.Motorcycle;

public interface VehicleFactory {

    Car createCar();

    Motorcycle createMotorcycle();

}






