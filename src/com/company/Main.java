package com.company;

import com.company.abstractfactorymethod.RussianFactory;
import com.company.abstractfactorymethod.TransportFactory;
import com.company.abstractfactorymethod.UsaFactory;

public class Main {

    public static void main(String[] args) {

        TransportFactory factory;

        if (true) {
            factory = new RussianFactory();
        } else {
            factory = new UsaFactory();
        }

        factory.createAirCraft();
        factory.createCar();
    }
}
