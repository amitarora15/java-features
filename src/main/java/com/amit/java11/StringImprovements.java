package com.amit.java11;

public class StringImprovements {

    public static void main(String[] args) {

        if(!" ".isEmpty()){
            System.out.println("str is not empty, has whitespace");
        }
        if(" ".isBlank()){
            System.out.println("str is blank (ignore whitespace)");
        }

        String str = "My\nname\nis\nAmit\nArora";
        str.lines().forEach(System.out::println);

        str = "Java11";
        System.out.println(str.repeat(3));

        str = " Amit ";
        System.out.println(str.trim());
        System.out.println(str.strip());
        System.out.println(str.stripLeading());
        System.out.println(str.stripTrailing());

    }
}
