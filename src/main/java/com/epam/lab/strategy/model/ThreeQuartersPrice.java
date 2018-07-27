package com.epam.lab.strategy.model;

public class ThreeQuartersPrice implements Strategy {
    public double getPrice(double price) {
        return price * 0.75;
    }
}
