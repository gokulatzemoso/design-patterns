package com.patterns.chain_of_responsibility;

public class IllegalAccessExceptionHandler extends AbstractExceptionHandler{

    public IllegalAccessExceptionHandler(ExceptionHandler next) {
        super(next);
    }

    @Override
    public void handleException(Exception e) {
        if (e instanceof IllegalAccessException) {
            System.out.println(String.format("Handling IllegalAccessException: %s", e.getMessage()));
        } else {
            if (next != null) {
                next.handleException(e);
            }
        }
    }
}
