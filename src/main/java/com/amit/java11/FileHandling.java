package com.amit.java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileHandling {
    public static void main(String[] args) throws IOException {
        System.out.println(Files.readString(Path.of("my.txt")));

        Files.writeString(Path.of("my.txt"), "\nAmit\nArora");
        Files.readString(Path.of("my.txt")).lines().forEach(System.out::println);

        Path path = Files.writeString(Files.createTempFile("test", ".txt"), "This was posted on JD");
        System.out.println(path);
        String s = Files.readString(path);
        System.out.println(s); //This was posted on JD
    }
}
