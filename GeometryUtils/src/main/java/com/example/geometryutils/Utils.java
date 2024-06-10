package com.example.geometryutils;

import com.example.geometry.Circle;

public class Utils {
    public static double convertToCentimeters(double valueInInches) {
        return valueInInches * 2.54;
    }

    public static boolean compareAreas(Circle circle1, Circle circle2) {
        return circle1.getArea() == circle2.getArea();
    }
}