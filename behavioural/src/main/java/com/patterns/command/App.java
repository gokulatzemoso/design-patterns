package com.patterns.command;

public class App {

    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        CopyCommand cpCommand = new CopyCommand(stringBuffer,"to be copied");
        PasteCommand toBePasted = new PasteCommand(stringBuffer);
        CommandStack.executeCommand(cpCommand);
        CommandStack.executeCommand(toBePasted);
        CommandStack.undo();
        CommandStack.undo();
    }
}
