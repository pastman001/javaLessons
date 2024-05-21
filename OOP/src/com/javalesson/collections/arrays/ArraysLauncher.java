package com.javalesson.collections.arrays;


import java.util.Scanner;

public class ArraysLauncher {
    private static int[] array;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 8 int elements");
        int[] myArray = new int[8];
        for (int j = 0; j < myArray.length; j++) {
            System.out.println("Next element");
            myArray[j] = scanner.nextInt();
        }
       sort(myArray);

        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Element " + i + " = " + myArray[i]);
        }
    }

    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; i++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
}
