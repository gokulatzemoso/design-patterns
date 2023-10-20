package com.patterns.decorator;

public class App {

    public static void main(String[] args) {
        DefaultFileWriter fileWriter = new DefaultFileWriter();
        System.out.println(fileWriter.writeContent("test-basic"));

        EncryptedFileWriter encryptedFileWriter = new EncryptedFileWriter(fileWriter);
        System.out.println(encryptedFileWriter.writeContent("test-encrypted"));
    }
}
