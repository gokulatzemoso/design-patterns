package com.patterns.abstract_factory;

public class TataCarFactory implements AbstractCarFactory {

    @Override
    public AbstractCar getCar(String model) {
        switch (model) {
            case "Nexon":
                return new TataNexon();
            default:
                break;
        }
        return null;
    }
}
