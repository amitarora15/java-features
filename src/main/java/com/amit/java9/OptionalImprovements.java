package com.amit.java9;

import java.util.Optional;
import java.util.function.Supplier;

public class OptionalImprovements {

    public static void main(String[] args) {
        Optional<String> optionalS = Optional.ofNullable("Amit");

        Optional<String> optionalS1 = Optional.ofNullable(null);

        optionalS.ifPresentOrElse(x -> System.out.println(x), () -> System.out.println("Not present"));
        optionalS1.ifPresentOrElse(x -> System.out.println(x), () -> System.out.println("Not present"));

        Supplier<Optional<String>> supp = () -> Optional.of("Not found");
        System.out.println(optionalS.or(supp));
        System.out.println(optionalS1.or(supp));

    }
}
