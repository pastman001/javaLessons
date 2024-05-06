package com.javalesson.hometask2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loanAmount = sc.nextInt();
        int years  = sc.nextInt();
        int interestRate  = sc.nextInt();
        int extraPayment   = sc.nextInt();

        Calc cal = new Calc(loanAmount,years,interestRate,extraPayment );

    }
}
