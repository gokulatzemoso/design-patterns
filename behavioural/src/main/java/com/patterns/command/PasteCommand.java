package com.patterns.command;

public class PasteCommand implements FileOperationCommand{

    private StringBuffer stringBuffer;
    private String content;
    public PasteCommand(StringBuffer stringBuffer) {
        this.stringBuffer = stringBuffer;
    }

    @Override
    public void execute() {
        System.out.println(String.format("pasting %s", stringBuffer.toString()));
        this.content = stringBuffer.toString();
    }

    @Override
    public void undo() {
        System.out.println("clearing content");
        content = "";
    }
}
