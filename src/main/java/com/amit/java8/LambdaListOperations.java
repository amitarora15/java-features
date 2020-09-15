package com.amit.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaListOperations {



    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c");

        List<Person> persons = Arrays.asList(new Person("Amit", 39, Person.GENDER.M), new Person("Divya", 34, Person.GENDER.F), new Person("Amit", 34, Person.GENDER.F));

        System.out.println(persons.stream().filter(p -> p.getGender() == Person.GENDER.M).collect(Collectors.toList()));
        persons.stream().forEach(e -> System.out.println(e));

        persons.sort((e1, e2) -> e1.compareTo(e2));
        System.out.println(persons);

        Person[] personArray = persons.toArray(new Person[persons.size()]);

        Arrays.sort(personArray, Person::compareByAge);
        Arrays.stream(personArray).forEach(System.out::print);

        //Arrays.sort(personArray, p);

    }
}
