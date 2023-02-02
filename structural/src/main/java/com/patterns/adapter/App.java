package com.patterns.adapter;

public class App {

    public static void main(String[] args) {
        LinuxFileProcessor linuxFileProcessor = new LinuxFileProcessor();
        linuxFileProcessor.processFile("test.so");

        WindowsFileProcessor windowsFileProcessor = new WindowsFileProcessor();
        windowsFileProcessor.processWindowsFile("test.bat");

        WindowsFileReaderAdapter windowsFileReaderAdapter = new WindowsFileReaderAdapter(windowsFileProcessor);
        windowsFileReaderAdapter.processFile("test.bat");
    }
}
