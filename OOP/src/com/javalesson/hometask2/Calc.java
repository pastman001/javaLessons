package com.javalesson.hometask2;

public class Calc {
    public Calc(int loanAmount, int years, int interestRate){
        this(loanAmount,years,interestRate,0);
    }
    public Calc(int loanAmount, int years, int interestRate, int extraPayment){
        System.out.println(years*12+(interestRate/100/12));
        System.out.println("loanAmount = "+loanAmount+" years = "+years
                +" interestRate = "+interestRate+" extraPayment = "+extraPayment);
    }


}
