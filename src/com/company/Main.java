package com.company;

import com.company.fabricmethod.Car;
import com.company.fabricmethod.CarSelector;
import com.company.fabricmethod.RoadType;

public class Main {

    public static void main(String[] args) {

        Car car = CarSelector.getInstance().getCar(RoadType.CITY);
        car.drive();
        car.stop();

        car = CarSelector.getInstance().getCar(RoadType.OFFROAD);
        car.drive();
        car.stop();

        car = CarSelector.getInstance().getCar(RoadType.GAZON);
        car.drive();
        car.stop();
    }
}
