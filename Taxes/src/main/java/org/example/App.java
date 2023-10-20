package org.example;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Please enter you salary");
        try{
            System.out.println("The amount of tax you pay is: " + taxBracket(myObj.nextInt()));
        } catch (Exception e) {
            System.out.println("Please only give an integer");
            System.out.println(e.getStackTrace());
            System.exit(0);
        }
    }

    public static int taxBracket(int salary) {
        int taxPercentage = 0;
        if (salary < 0){
            System.out.println("Please give a positive number");
        } else if (salary >= 0 && salary < 15000){
            taxPercentage = 0;
            System.out.println("You are in the " + taxPercentage + "% tax bracket");
        } else if (salary > 14999 && salary < 20000){
            taxPercentage = 10;
            System.out.println("You are in the " + taxPercentage + "% tax bracket");
        } else if (salary > 19999 && salary < 30000){
            taxPercentage = 15;
            System.out.println("You are in the " + taxPercentage + "% tax bracket");
        } else if (salary > 29999 && salary < 45000) {
            taxPercentage = 20;
            System.out.println("You are in the " + taxPercentage + "% tax bracket");
        } else if (salary > 44999) {
            taxPercentage = 25;
            System.out.println("You are in the " + taxPercentage + "% tax bracket");
        }
        int taxAmount = getTaxAmount(taxPercentage, salary);
        return taxAmount;
    }
    public static int getTaxAmount( int taxPercentage, int salary) {

        return 5;
    }
}
