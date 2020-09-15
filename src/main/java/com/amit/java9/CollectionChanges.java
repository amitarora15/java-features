package com.amit.java9;

import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class CollectionChanges {

    public static void main(String[] args) {
        List<String> list = List.of("Amit", "Divya");
        System.out.println(list);

        Map<String, Integer> map = Map.of("Amit", 39, "Divya", 36);
        System.out.println(map);

        Stream.of(1,2,8,4,5,6,7,8,9).takeWhile(a -> a < 5).forEach(System.out::print);
        System.out.println("*****");
        Stream.of(1,2,8,4,5,6,7,8,9).dropWhile(a -> a < 5).forEach(System.out::print);
        System.out.println("*****");
        Stream.iterate(1, x -> x < 5, x -> x + 1).forEach(System.out::print);

    }

    @Deprecated(forRemoval = true, since = "20-03-2021")
    public  void test () {

    }

}
