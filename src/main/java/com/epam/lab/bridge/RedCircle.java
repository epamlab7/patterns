package com.epam.lab.bridge;

public class RedCircle implements DrawAPI {

    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing bridge.Circle[ color: red, radius: " + radius + ", x: " + x + ", " + y + "]");
    }
}