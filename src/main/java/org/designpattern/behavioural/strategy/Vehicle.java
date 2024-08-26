package org.designpattern.behavioural.strategy;

public abstract class Vehicle {
    private DriveStrategy driveStrategy;

    public Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public abstract void drive();

    public DriveStrategy getDriveStrategy() {
        return driveStrategy;
    }
}
