package com.javalesson.methods;

public class Methods {
    public static void main(String[] args) {
        printMessage("Alex");
        printMessage("John");
        printMessage("Mike");

        System.out.println("Rectangle square = " + calcRectangleSquare(5, 10));
        System.out.println("Square = " + calcSquare(10));
        System.out.println("Sum of squares = " + (calcSquare(10) + calcRectangleSquare(5, 10)));

        String str1 = "I like black coffee";
        String str3 = "I like coffee!!!";

        System.out.println(str1.toUpperCase());
        System.out.println(str1.toLowerCase());

        String str2 = "I like coffee";
        String str4 = new String("I like coffee");
        String substring = str3.substring(0, 13);
        System.out.println("Substring = " + substring);
        boolean b = str2.equals(substring);
        System.out.println(b);
        boolean iLike = str1.endsWith("fee!");
        System.out.println(iLike);
        System.out.println(str1.replace("black", "white"));
        System.out.println(str3.indexOf("!!!"));

    }

    static void printMessage(String name) {
        System.out.println("Hello " + name + "!!!");
    }

    static int calcRectangleSquare(int x, int y) {
        int square = x * y;
        //System.out.println("Rectangle square = "+square);
        return square;
    }

    static int calcSquare(int x) {
        return x * x;
    }
}
