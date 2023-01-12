package com.patterns.abstract_factory;

public class TataNexon implements AbstractCar {

    @Override
    public String getMaker() {
        return "Tata";
    }

    @Override
    public String getPower() {
        return "1500";
    }
}
