package com.patterns.builder;

public class App {
    public static void main(String args[]) {
        Supermarket builder = new Supermarket.
                Builder("d-mart").
                withFood(Food.of("groceries")).
                withFurniture(Furniture.of("sofa")).build();

        Supermarket chairs = new Supermarket.
                Builder("at-home").
                withFood(Food.of("fast-food")).
                withFurniture(Furniture.of("chairs")).build();
    }
}
