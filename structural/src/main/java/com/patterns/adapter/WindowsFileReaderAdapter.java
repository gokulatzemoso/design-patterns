package com.patterns.adapter;

public class WindowsFileReaderAdapter implements FileReader{
    private WindowsFileProcessor windowsFileProcessor;

    public WindowsFileReaderAdapter(WindowsFileProcessor windowsFileProcessor) {
        this.windowsFileProcessor = windowsFileProcessor;
    }

    @Override
    public String processFile(String filePath) {
        System.out.println(String.format("Processing windows file with file reader %s", filePath));
        return windowsFileProcessor.processWindowsFile(filePath);
    }
}
