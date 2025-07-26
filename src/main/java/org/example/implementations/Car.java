package org.example.implementations;

import org.example.abstractions.MotorizedVehicle;

public class Car extends MotorizedVehicle {
    public Car(String brand) {
        super(brand);
    }

    @Override
    public void startEngine() {
        System.out.println("The car is starting its engine.");
    }

    @Override
    public void move() {
        System.out.println("The car is moving");
    }

    @Override
    public void refuel() {
        System.out.println("The car is refueling");
    }
}
