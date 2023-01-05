package com.patterns.factory;

public class App {

    public static void main(String[] args) {
        Boolean stringTest = ValidationFactory.makeValidator(Datatype.STRING).apply("test");
        Boolean integerTest = ValidationFactory.makeValidator(Datatype.INTEGER).apply("230");
    }
}
