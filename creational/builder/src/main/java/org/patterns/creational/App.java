package org.patterns.creational;

public class App {
    public static void main(String args[]) {
        Supermarket.Builder builder = new Supermarket.
                Builder("d-mart").
                withFood(Food.of("groceries")).
                withFurniture(Furniture.of("sofa"));

        Supermarket.Builder chairs = new Supermarket.
                Builder("at-home").
                withFood(Food.of("fast-food")).
                withFurniture(Furniture.of("chairs"));
    }
}
