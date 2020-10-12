package com.amit.java11;

import lombok.NonNull;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class VarLambda {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Amit","Medhansh","Divya","Idhika");
        String joinedString = list.stream().map(
                (@NonNull var x) -> x.toUpperCase()
        ).collect(Collectors.joining(","));
        System.out.println(joinedString);

    }


}
