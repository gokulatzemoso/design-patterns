package com.patterns.abstract_factory;

public class App {

    public static void main(String[] args) {
        AbstractCarFactory tata = CarFactoryProvider.getFactory("Tata");
        AbstractCar nexon = tata.getCar("Nexon");
        System.out.println(String.format("%s:%s", nexon.getMaker(), nexon.getPower()));
    }
}
