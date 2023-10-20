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
            int salary = myObj.nextInt();
            System.out.println("The tax bracket you are in is: " + taxBracket(salary) + "with a salary of" + salary);
            System.out.println("You pay: " + getTaxAmount(taxBracket(salary), salary));
        } catch (Exception e) {
            System.out.println("Please only give an integer");
            System.out.println(e.getStackTrace());
            System.exit(0);
        }
    }

    public static int taxBracket(int salary) {
        int taxPercentage = 0;
        double taxPaid = 0;
        if (salary < 0){
            System.out.println("Please give a positive number");
        } else if (salary >= 0 && salary < 15000){
            taxPercentage = 0;
            taxPaid = 0;
        } else if (salary > 14999 && salary < 20000){
            taxPercentage = 10;
            taxPaid = (salary - 14999) * (taxPercentage/100);
        } else if (salary > 19999 && salary < 30000){
            taxPercentage = 15;
            taxPaid =  499.90 + (salary - 19999) * (taxPercentage/100);
        } else if (salary> 29999 && salary < 45000) {
            taxPercentage = 20;
            taxPaid =  1999.75 + (salary - 29999) * (taxPercentage/100);
        } else if (salary > 44999) {
            taxPercentage = 25;
            taxPaid = 5749.5 + (salary - 44999) * (taxPercentage/100);
        }
        int taxAmount = getTaxAmount(taxPercentage, salary);
        return taxAmount;
    }
//    public static int getTaxAmount(int taxPercentage, int salary) {
//        return salary * taxPercentage;
//    }
}
