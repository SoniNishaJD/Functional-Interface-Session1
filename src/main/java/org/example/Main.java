package org.example;

@FunctionalInterface
interface MyFunctionalInterface {
    void myMethod(String input);
}


public class Main {
    public static void main(String[] args) {
        // Using lambda expression to implement the single abstract method of MyFunctionalInterface
        MyFunctionalInterface myFunc = (input) -> System.out.println("Input: " + input);

        // Calling the method defined by the functional interface using the lambda implementation
        myFunc.myMethod("Hello, World!");
    }
}