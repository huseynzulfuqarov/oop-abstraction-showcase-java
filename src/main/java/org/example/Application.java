package org.example;

import org.example.abstractions.MotorizedVehicle;
import org.example.implementations.Car;
import org.example.implementations.Motorcycle;

public class Application {

    public static void main(String[] args) {

        System.out.println("----- Car -----");
        MotorizedVehicle myCar = new Car("Mercedes-Benz");
        System.out.println("Brand: " + myCar.getBrand());
        myCar.startEngine();
        myCar.move();
        myCar.refuel();

        System.out.println("----- Motorcycle -----");
        MotorizedVehicle myMotorcycle = new Motorcycle("Harley-Davidson");
        System.out.println("Brand: " + myMotorcycle.getBrand());
        myMotorcycle.startEngine();
        myMotorcycle.move();
        myMotorcycle.refuel();

        // MotorizedVehicle v1 = new MotorizedVehicle("test"); ERROR
        // Vehicle v2 = new Vehicle("test"); // ERROR
    }
}
