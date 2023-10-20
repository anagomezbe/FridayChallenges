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
            double bracket = taxBracket(salary);
            double taxedMoney = getTaxAmount(bracket, salary);
            System.out.println("The tax rate you are in is: " + bracket * 100 + "%, with a salary of: £" + salary);
            System.out.println("The amount of tax you will pay is: £" + taxedMoney);
            System.out.println("The money you will have left over is : £" + (salary - taxedMoney));
        } catch (Exception e) {
            System.out.println("Please only give an integer");
            System.out.println(e.getStackTrace());
            System.exit(0);
        }
    }

    public static double taxBracket(int salary) {
        double taxPercentage = 0.0;

        if (salary < 0){
            System.out.println("Please give a positive number");
        } else if (salary >= 0 && salary < 15000){
            taxPercentage = 0;
        } else if (salary > 14999 && salary < 20000){
            taxPercentage = 0.1;
        } else if (salary > 19999 && salary < 30000){
            taxPercentage = 0.15;
        } else if (salary> 29999 && salary < 45000) {
            taxPercentage = 0.20;
        } else if (salary > 44999) {
            taxPercentage = 0.25;
        }
        return taxPercentage;
    }
    public static double getTaxAmount(double bracket, int salary) {
        double taxPaid = 0;
        double bracket1 = 0, bracket2 = 0.10, bracket3 = 0.15, bracket4 = 0.2, bracket5 = 0.25;
        double maxtax1 = 0 * bracket1;
        double maxTax2 = maxtax1 + (20000 - 14999) * bracket2;
        double maxTax3 = maxTax2 + (30000 - 19999) * bracket3;
        double maxTax4 = maxTax3 + (45000 - 29999) * bracket4;
        double maxTax5 = maxTax4 + (salary - 45000) * bracket5;

        if (salary < 0){
            System.out.println("Please give a positive number");
        } else if (salary >= 0 && salary < 15000){
            taxPaid = maxtax1;
        } else if (salary > 14999 && salary < 20000){
            taxPaid = maxtax1 + (salary - 15000) * bracket2;
        } else if (salary > 19999 && salary < 30000){
            taxPaid =  maxTax2 + (salary - 20000) * bracket3;
        } else if (salary> 29999 && salary < 45000) {
            taxPaid =  maxTax3 + (salary - 30000) * bracket4;
        } else if (salary > 44999) {
            taxPaid = maxTax5;
        }
        return taxPaid;
    }
}
