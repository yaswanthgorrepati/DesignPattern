package org.designpattern.behavioural.strategy;

public class OffRoadCar extends Vehicle{
    public OffRoadCar(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }

    @Override
    public void drive() {
        super.getDriveStrategy().drive();
    }
}
