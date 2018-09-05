package com.company;

public class VehicleFactory {

    Vehicle getVehicle(VehicleType type){
        switch (type){
            case CAR:
                return new Car();
            case BIKE:
                return new Bike();
            case TRUCK:
                return new Truck();
                default: return null;
        }
    }
}
