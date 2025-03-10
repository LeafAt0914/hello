package com.leaf.designPatterns.creational.factoryPattern.simpleFactoryPattern;


/**
 * @author leshu
 * @since 2025/3/10 11:50
 **/
public class Main {
    public static void main(String[] args) {
        String transportType = "TRAIN";
        if ("TRAIN".equals(transportType)) {
            Train train = new Train();
            train.goHomeByTrain();
        }

        transportType = "AIRPLANE";
        if ("AIRPLANE".equals(transportType)) {
            AirPlane airPlane = new AirPlane();
            airPlane.goHomeByAirPlane();
        }

        transportType = "CAR";
        if ("CAR".equals(transportType)) {
            Car car = new Car();
            car.goHomeByCar();
        }

    }
}
