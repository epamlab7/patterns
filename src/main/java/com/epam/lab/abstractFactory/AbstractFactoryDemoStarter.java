package com.epam.lab.abstractFactory;

import com.epam.lab.abstractFactory.factory.MountainVehicleFactory;
import com.epam.lab.abstractFactory.factory.SportVehicleFactory;
import com.epam.lab.abstractFactory.factory.VehicleFactory;
import com.epam.lab.abstractFactory.model.Car;
import com.epam.lab.abstractFactory.model.Motorcycle;
import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AbstractFactoryDemoStarter {

    private static final String ABSTRACT_FACTORY_INFO_FILE_PATH = "src/main/resources/abstractFactory/absFactory_info.txt";
    private static final Logger LOG = Logger.getLogger(AbstractFactoryDemoStarter.class);

    public static void startAbstractFactoryDemo() throws IOException {
        displayIteratorDescription();
        VehicleFactory sportVehicleFactory = new SportVehicleFactory();
        VehicleFactory mountainVehicleFactory = new MountainVehicleFactory();
        LOG.info("SportVehicleFactory:");
        test(sportVehicleFactory);
        LOG.info("\nMountainVehicleFactory:");
        test(mountainVehicleFactory);
    }

    private static void test(VehicleFactory vehicleFactory) {
        Car car = vehicleFactory.createCar();
        car.print();
        Motorcycle motorcycle = vehicleFactory.createMotorcycle();
        motorcycle.print();
    }

    private static void displayIteratorDescription() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(ABSTRACT_FACTORY_INFO_FILE_PATH));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            LOG.info(line);
        }
    }
}



