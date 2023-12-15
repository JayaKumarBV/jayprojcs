package com.jayxyram;

import java.awt.*;
import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Mortgage {
    public static <string> void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        int principal =0;
        float monthlyInterest=0;

        int numberOfPayments=0;

        Scanner scanner = new Scanner(System.in);

        while(true){
        System.out.print("Principal: ");
        principal = scanner.nextInt();
        if (principal >=1000 && principal <=1_000_000)
            break;
            System.out.println("Enter principal Value greater than 1000 and Less than 1000000");
        }

        while(true) {
            System.out.print("Annual Interest Rate: ");
            float annualInterest = scanner.nextFloat();
            if (annualInterest >= 1 && annualInterest <= 30) {
                 monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
                break;
            }
            System.out.println("Enter   Interest Value Rate between 1 to 1000");
        }


        while(true) {
        System.out.print("Period (Years): ");
        byte years = scanner.nextByte();
        if(years>=1 && years<=30){
         numberOfPayments = years * MONTHS_IN_YEAR;
        break;
        }
        System.out.println("Enter   Interest Value Rate between 1 to 1000");
    }

        double mortgage = principal *
                (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);

    }
}
