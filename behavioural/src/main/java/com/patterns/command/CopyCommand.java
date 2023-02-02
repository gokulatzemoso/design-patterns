package com.patterns.command;

public class CopyCommand implements FileOperationCommand{

    private StringBuffer stringBuffer;
    private String content;

    public CopyCommand(StringBuffer stringBuffer, String content) {
        this.stringBuffer = stringBuffer;
        this.content = content;
    }

    @Override
    public void execute() {
        stringBuffer.append(content);
        System.out.println(String.format("Appendin in buffer %s", stringBuffer.toString()));
    }

    @Override
    public void undo() {
        stringBuffer.delete(0, content.length());
        System.out.println("clearing buffer");
    }
}
