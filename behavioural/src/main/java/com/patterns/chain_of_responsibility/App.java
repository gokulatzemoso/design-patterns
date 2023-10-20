package com.patterns.chain_of_responsibility;

public class App {

    public static void main(String[] args) {
        ClassNotFoundExceptionHandler classNotFoundExceptionHandler = new ClassNotFoundExceptionHandler(null);
        IllegalAccessExceptionHandler illegalAccessExceptionHandler = new IllegalAccessExceptionHandler(classNotFoundExceptionHandler);

        try {
            throw new ClassNotFoundException("Class not found test");
        } catch (Exception e) {
            illegalAccessExceptionHandler.handleException(e);
        }

        try {
            throw new IllegalAccessException("Illegal access test");
        } catch (Exception e) {
            illegalAccessExceptionHandler.handleException(e);
        }
    }
}
