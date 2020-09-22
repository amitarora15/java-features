package com.amit.java10;

import java.util.List;

public class LocalInference {

    public static void main(String[] args) {
        var v = List.of(1, 2);
        System.out.println(v);

        for(var i =0 ; i < 5;i++){
            System.out.print(i + ",");
        }
        System.out.println();
        for(var i : new int[]{1,2,3,4}){
            System.out.print(i + ",");
        }

    }

}
