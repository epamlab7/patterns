package com.epam.lab.strategy.model;

public class FullPrice implements Strategy {

    public double getPrice(double price) {
        return price;
    }
}
