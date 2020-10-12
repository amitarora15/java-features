package com.amit.java12;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

public class Files {

    public static void main(String[] args) throws IOException {
        Path path1 = java.nio.file.Files.createTempFile("file1", ".txt");
        Path path2 = java.nio.file.Files.createTempFile("file2", ".txt");

        java.nio.file.Files.writeString(path1, "This is sample");
        java.nio.file.Files.writeString(path2, "This is sample");

        System.out.println(java.nio.file.Files.mismatch(path1, path2));

        path1.toFile().deleteOnExit();
        path2.toFile().deleteOnExit();

        path1 = java.nio.file.Files.createTempFile("file3", ".txt");
        path2 = java.nio.file.Files.createTempFile("file4", ".txt");

        java.nio.file.Files.writeString(path1, "Thiws is sample");
        java.nio.file.Files.writeString(path2, "This is sample");

        System.out.println(java.nio.file.Files.mismatch(path1, path2));

        path1.toFile().deleteOnExit();
        path2.toFile().deleteOnExit();

    }
}
