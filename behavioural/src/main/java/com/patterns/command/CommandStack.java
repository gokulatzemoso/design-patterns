package com.patterns.command;

import java.util.Stack;

public class CommandStack {

    private static Stack<FileOperationCommand> fileOperationCommands = new Stack<>();

    public static void executeCommand(FileOperationCommand fileOperationCommand) {
        fileOperationCommands.add(fileOperationCommand);
        fileOperationCommand.execute();
    }

    public static void undo() {
        FileOperationCommand pop = fileOperationCommands.pop();
        pop.undo();
    }
}
