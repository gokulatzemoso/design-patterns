package com.patterns.decorator;

public class DefaultFileWriter implements FileWriter{
    @Override
    public String writeContent(String content) {
        System.out.println(String.format("Writing default mode %s", content));
        return "default:".concat(content);
    }
}
