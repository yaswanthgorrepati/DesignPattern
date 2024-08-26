package org.designpattern.behavioural.strategy;

public class PassengerCar extends Vehicle{
    public PassengerCar(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }

    @Override
    public void drive() {
        super.getDriveStrategy().drive();
    }

}
