package com.epam.lab.factoryMethod;

public class FactoryMethodTest {
    public static void factoryMethodRun(String[] args) {
        AutoFactory autoFactory = readFiles("ford");
        Auto auto = autoFactory.createTheAuto();
        auto.readAuto();
    }
    static AutoFactory readFiles(String name) {
        if (name.equals("ford")) {
            return new FordFactory();
        }
        if (name.equals("audi")) {
            return new AudiFactory();
        }
        else throw new RuntimeException(name + " concern is unknown");
    }
}
