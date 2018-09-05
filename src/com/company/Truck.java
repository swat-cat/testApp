package com.company;

public class Truck extends Vehicle{

    @Override
    int getNumberOfWheels() {
        return 8;
    }

    @Override
    String getType() {
        return "Truck";
    }

    @Override
    String licenceCategory() {
        return "E";
    }
}
