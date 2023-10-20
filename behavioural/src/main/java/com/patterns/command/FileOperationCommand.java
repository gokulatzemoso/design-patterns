package com.patterns.command;

public interface FileOperationCommand {
    void execute();
    void undo();
}
