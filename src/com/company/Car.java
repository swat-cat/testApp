package com.company;

public class Car extends Vehicle{
    @Override
    int getNumberOfWheels() {
        return 4;
    }

    @Override
    String getType() {
        return "Car";
    }

    @Override
    String licenceCategory() {
        return "B";
    }
}
