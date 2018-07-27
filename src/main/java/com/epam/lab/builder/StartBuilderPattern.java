package com.epam.lab.builder;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileReader;

public class StartBuilderPattern {

    private static final String BUILDER_INFO_PATH = "src/main/resources/builder/builder_info.txt";
    private static final Logger LOG = LogManager.getLogger("com.epam.lab");

    public static void startDecoratorDemo() {
        readFile();
        Director director = new Director();
        director.setBuilder(new MitsubishiBuilder());
        Car car = director.buildCar();
        LOG.info(car);

        director.setBuilder(new FordBuilder());
        car = director.buildCar();
        LOG.info(car);
    }

    private static void readFile() {
        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader(BUILDER_INFO_PATH));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                LOG.info(line);
            }
            bufferedReader.close();
        } catch(Exception e){
            LOG.error(e.getMessage());
        }
    }


}
