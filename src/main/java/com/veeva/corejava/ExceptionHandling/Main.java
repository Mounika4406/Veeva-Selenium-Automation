
package com.veeva.corejava.ExceptionHandling;

public class Main {

    public static void main(String[] args) {

        int a = 10;
        int b = 0;

        // Normal statement
        System.out.println("Program started");

        try {

            // Code that may cause an exception
            int result = a / b;

            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {

            // Handling the exception
            System.out.println("Cannot divide a number by zero");

        } finally {

            // Always executes
            System.out.println("Finally block executed");

        }

        System.out.println("Program completed");
    }
}