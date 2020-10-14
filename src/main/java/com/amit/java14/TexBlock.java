package com.amit.java14;

public class TexBlock {

    public static void main(String[] args) {
        String sql = """
                select * \
                \sfrom amit 
                 where a.age = 39""";
        System.out.println(sql);
    }
}
