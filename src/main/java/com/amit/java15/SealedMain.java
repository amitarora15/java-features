package com.amit.java15;

import com.amit.java15.herbivores.Goat;

public class SealedMain {

    public static void main(String[] args) {
        AnimalSealed goat = new Goat();
        goat.play();
    }
}
