package com.javalesson.controlstatement;

public class ForLoop {
    public static void main(String[] args) {
        int factorialLimit = 10;
        int factorial = 1;
        for (int i = 1; i <= factorialLimit; i++) {
            factorial *= i;
            System.out.println("Factorial = " + factorial);
        }

        System.out.println("Final factorial value = " + factorial);

        for (int i = 10; i >= 1; i--) {
            System.out.println("I = "+i);
        }
    }
}
