package com.patterns.adapter;

import java.io.File;

public class WindowsFileProcessor {

    public String processWindowsFile(String path) {
        System.out.println(String.format("Reading windows file ntfs %s", path));
        return String.format("C://%s", path);
    }
}
