package com.company;

public enum VehicleType {
    CAR("Car"),
    BIKE("Bike"),
    TRUCK("Truck");

    private String value;
    VehicleType(String value) {
    }

    public String getValue() {
        return value;
    }
}
