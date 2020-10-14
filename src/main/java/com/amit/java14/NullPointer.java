package com.amit.java14;

public class NullPointer {

    class A {
        public B bInstance;
    }

    class B {
        public C cInstance;
    }

    class C {

    }

    private void method(){
       // C cInstance = new C();
        //B bInstance = new B();
        A aInstance = new A();
        //aInstance.bInstance = bInstance;
        System.out.println(aInstance.bInstance.cInstance.toString());
    }

    public static void main(String[] args) {
        new NullPointer().method();
    }
}
