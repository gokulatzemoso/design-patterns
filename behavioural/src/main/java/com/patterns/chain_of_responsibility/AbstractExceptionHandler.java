package com.patterns.chain_of_responsibility;

public abstract class AbstractExceptionHandler implements ExceptionHandler{
    protected ExceptionHandler next;

    public AbstractExceptionHandler(ExceptionHandler next) {
        this.next = next;
    }
}
