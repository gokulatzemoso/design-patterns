package com.patterns.abstract_factory;

public class CarFactoryProvider {

    public static AbstractCarFactory getFactory(String maker) {
        switch (maker) {
            case "Tata":
                return new TataCarFactory();
            default:
                return null;
        }
    }
}
