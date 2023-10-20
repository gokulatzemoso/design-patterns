package com.patterns.decorator;

public class EncryptedFileWriter extends FileWriterDecorator{

    public EncryptedFileWriter(FileWriter fileWriter) {
        super(fileWriter);
    }

    @Override
    public String writeContent(String content) {
        System.out.println(String.format("Encrypting %s", content));
        String concat = "Encrypted".concat(content);
        fileWriter.writeContent(concat);
        return concat;
    }
}
