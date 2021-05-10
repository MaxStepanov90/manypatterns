package com.company.abstractfactorymethod;

public class Porsche implements Car {
    @Override
    public void drive() {
        System.out.println("Drive speed at 150 km/h");
    }

    @Override
    public void stop() {
        System.out.println("Stopped at 1 sec");
    }
}
