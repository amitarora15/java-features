package com.amit.java9;

public class Process {

    public static void main(String[] args) {
       // ProcessHandle.allProcesses().forEach(System.out::println);
        ProcessHandle currrent = ProcessHandle.current();
        System.out.println(currrent.pid());
    }
}
