package com.patterns.adapter;

public class LinuxFileProcessor implements FileReader {

    @Override
    public String processFile(String filePath) {
        System.out.println(String.format("Linux file processor %s", filePath));
        return String.format("/opt/%s", filePath);
    }
}
