package org.example;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {
        System.out.println( "Please enter two positive integers ");
        Scanner myObj = new Scanner(System.in);
        int num1 = myObj.nextInt();
        int num2 = myObj.nextInt();
        System.out.println("Closest number is: " + blackJack(num1, num2));
    }

    public static int blackJack(int num1, int num2) {
        Scanner myObj = new Scanner(System.in);
        while (num1 < 0 || num2 < 0){
            System.out.println("Please enter two positive integers ONLY");
            num1 = myObj.nextInt();
            num2 = myObj.nextInt();
        }

        if (num1 > 21 && num2 > 21) return 0;

        int diff1 = (21 - num1);
        int diff2 = (21 - num2);

        if (diff1 < diff2)
            return  num1;
           else return num2;
        }

    }
