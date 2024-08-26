package org.designpattern.behavioural.strategy;

public class Main {

    public static void main(String[] args) {
        DriveStrategy normalDriveStrategy = new NormalDriveStrategy();
        DriveStrategy sportsDriveStrategy = new SportsDriveStrategy();

        Vehicle passengerCar = new PassengerCar(normalDriveStrategy);
        passengerCar.drive();

        Vehicle offRoadCar = new OffRoadCar(sportsDriveStrategy);
        offRoadCar.drive();

        Vehicle sportsCar = new SportsCar(sportsDriveStrategy);
        sportsCar.drive();

    }
}
