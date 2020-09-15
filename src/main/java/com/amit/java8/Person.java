package com.amit.java8;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Person implements Comparable<Person> {

    @Override
    public int compareTo(Person o) {
        return this.name.compareTo(o.getName());
    }

    public enum GENDER {M, F};

    private String name;

    private int age;

   private GENDER gender;

   public int compareByName(Person p1, Person p2){
       return p1.getName().compareTo(p2.getName());
   }

   public static  int compareByAge(Person p1, Person p2){
       return p1.getAge() - p2.getAge();
   }


}
