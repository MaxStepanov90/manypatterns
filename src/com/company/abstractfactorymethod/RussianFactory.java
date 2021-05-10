package com.company.abstractfactorymethod;

public class RussianFactory implements TransportFactory {
    @Override
    public Car createCar() {
        return new Niva();
    }

    @Override
    public AirCraft createAirCraft() {
        return new TU134();
    }
}
