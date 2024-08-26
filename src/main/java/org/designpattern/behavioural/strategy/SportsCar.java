package org.designpattern.behavioural.strategy;

public class SportsCar extends Vehicle{

    public SportsCar(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }

    @Override
    public void drive(){
        super.getDriveStrategy().drive();
    }
}
