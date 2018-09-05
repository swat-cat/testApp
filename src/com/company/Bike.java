package com.company;

public  class Bike extends Vehicle{
    @Override
    int getNumberOfWheels() {
        return 2;
    }

    @Override
    String getType() {
        return "Bike";
    }

    @Override
    String licenceCategory() {
        return "A";
    }
}
