package com.amit.java9;

interface PvtDefaultInterface {

    private void addSpices(){
        System.out.println("Adding spices while cooking food");
    }

    private static void addHoney(){
        System.out.println("Adding honey if required");
    }

    public default void cookFood(){
        addSpices();
        addHoney();
        System.out.println("Cooking food");
    }
}
public class PvtDefaultInterfaceMethod implements  PvtDefaultInterface{

    public static void main(String[] args) {
        PvtDefaultInterface impl = new PvtDefaultInterfaceMethod();
        impl.cookFood();
    }
}
