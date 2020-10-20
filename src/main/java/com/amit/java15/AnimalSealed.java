package com.amit.java15;

import com.amit.java15.carnivores.Lion;
import com.amit.java15.herbivores.Goat;

public sealed class AnimalSealed permits Goat, Lion {

    public void play(){
        System.out.println("Animal Playing");
    }

}
