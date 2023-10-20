package com.patterns.chain_of_responsibility;

public class ClassNotFoundExceptionHandler extends AbstractExceptionHandler{
    public ClassNotFoundExceptionHandler(ExceptionHandler next) {
        super(next);
    }

    @Override
    public void handleException(Exception e) {
        if (e instanceof ClassNotFoundException) {
            System.out.println(String.format("Handling ClassNotFound: %s", e.getMessage()));
        } else {
            if (next != null) {
                next.handleException(e);
            }
        }
    }
}
