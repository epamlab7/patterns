package com.epam.lab.strategy.model;

public class HalfPrice implements Strategy {
    public double getPrice(double price) {
        return 0.5 * price;
    }
}
