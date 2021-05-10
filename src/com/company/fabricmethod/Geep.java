package com.company.fabricmethod;

public class Geep implements Car {
    @Override
    public void drive() {
        System.out.println("Drive speed at 50 km/h");
    }

    @Override
    public void stop() {
        System.out.println("Stopped at 5 sec");
    }
}
