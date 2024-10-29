package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        // Create instances of each vehicle type
        Moped moped = new Moped();
        Car car = new Car();
        SemiTruck semiTruck = new SemiTruck();
        HoverCraft hovercraft = new HoverCraft();

        // Set values for Moped
        moped.setColor("Red");
        moped.setNumberOfPassengers(2);

        // Set values for Car
        car.setColor("Blue");
        car.setNumberOfPassengers(5);
        car.setFuelCapacity(50);


        // Set values for SemiTruck
        semiTruck.setColor("Green");
        semiTruck.setNumberOfPassengers(2);
        semiTruck.setCargoCapacity(20000);
        semiTruck.setFuelCapacity(300);

        // Set values for Hovercraft
        hovercraft.setColor("Yellow");
        hovercraft.setNumberOfPassengers(10);
        hovercraft.setCargoCapacity(5000);
        hovercraft.setFuelCapacity(100);


    }
}