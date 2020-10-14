package com.amit.java14;

record A(String name, int age) {

    static String city;

    public String name(){
        return "My name is " + name;
    }

    public static boolean test(){
        System.out.println("Testing");
        return false;
    }

    String print(){
        System.out.println("Printing person" + this);
        return "";
    }

    public A (String city){
        this("Test", 20);
        A.city = city;
    }

    public A {
        if (age < 0) {
            throw new IllegalArgumentException();
        }
    }
}

public class Records {



    public static void main(String[] args) {
        A a = new A("Amit", 20);
        System.out.println(a);
        System.out.println(a.age());
        System.out.println(a.name());
        System.out.println(a.print());
        System.out.println(A.test());
        System.out.println(a.getClass().isRecord());
        System.out.println(a.getClass().getRecordComponents());
        System.out.println(a.getClass().arrayType());

        A a1 = new A("Jaipur");
        System.out.println(A.city);
    }

}
