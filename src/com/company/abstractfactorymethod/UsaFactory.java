package com.company.abstractfactorymethod;

public class UsaFactory implements TransportFactory {
    @Override
    public Car createCar() {
        return new Porsche();
    }

    @Override
    public AirCraft createAirCraft() {
        return new Boeing747();
    }
}
