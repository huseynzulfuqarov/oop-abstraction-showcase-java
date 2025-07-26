package org.example.implementations;

import org.example.abstractions.MotorizedVehicle;

public class Motorcycle extends MotorizedVehicle {
    public Motorcycle(String brand) {
        super(brand);
    }

    @Override
    public void startEngine() {
        System.out.println("The motorcycle is starting its engine.");
    }

    @Override
    public void move() {
        System.out.println("The motorcycle is moving");
    }

    @Override
    public void refuel() {
        System.out.println("The motorcycle is starting its engine.");
    }
}
