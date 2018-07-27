package com.epam.lab.bridge;

public class GreenCircle implements DrawAPI {

    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing bridge.Circle[ color: green, radius: "
                + radius + ", x: " + x + ", " + y + "]");
    }
}