package com.patterns.decorator;

public abstract class FileWriterDecorator implements FileWriter{

    protected FileWriter fileWriter;

    protected FileWriterDecorator(FileWriter fileWriter) {
        this.fileWriter = fileWriter;
    }
}
