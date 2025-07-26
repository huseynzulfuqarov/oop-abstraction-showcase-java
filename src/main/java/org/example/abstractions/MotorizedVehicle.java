package org.example.abstractions;

import org.example.contracts.Movable;

public abstract class MotorizedVehicle extends Vehicle implements Movable {
    public MotorizedVehicle(String brand) {
        super(brand);
    }

    public abstract void refuel();
}
