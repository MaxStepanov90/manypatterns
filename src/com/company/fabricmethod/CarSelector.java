package com.company.fabricmethod;

public class CarSelector {

    private static CarSelector instance;

    private CarSelector() {
    }

    public static CarSelector getInstance() {
        if (instance == null) {
            instance = new CarSelector();
        }
        return instance;
    }

    public Car getCar(RoadType type) {
        Car car = null;
        switch (type) {
            case CITY:
                car = new Porsche();
                break;
            case OFFROAD:
                car = new Geep();
                break;
            case GAZON:
                car = new NewGeep();
                break;
        }
        return car;
    }
}
