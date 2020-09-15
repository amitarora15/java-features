package com.amit.java8;

import java.util.function.Supplier;

interface DefaultInterface {

    void printMe();

    default void printDefault(){
        System.out.println("In default method");
    }

}

class DefaultImpl implements DefaultInterface {

    @Override
    public void printMe() {
        System.out.println("Printing me..... in default way");
    }
}

class OverrideDefaultImpl implements DefaultInterface {

    @Override
    public void printMe() {
        System.out.println("Printing me .... in override way");
    }

    @Override
    public void printDefault() {
        System.out.println("Overriding default method");
    }
}

interface DefaultCreator {
    static DefaultInterface createDefault(Supplier<DefaultInterface> defaultTest){
        return defaultTest.get();
    }
}

public class DefaultInterfaceTest {

    public static void main(String[] args) {
        DefaultCreator.createDefault(DefaultImpl::new).printDefault();
        DefaultCreator.createDefault(OverrideDefaultImpl::new).printDefault();
    }

}
