package org.example;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class App {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Please enter the first number");
        int number1 = myObj.nextInt();
        System.out.println("Please enter the second number");
        int number2 = myObj.nextInt();
        System.out.println("Please enter the third number");
        int number3 = myObj.nextInt();

        ArrayList<Integer> unchecked = new ArrayList<Integer>();
        unchecked.add(number1);
        unchecked.add(number2);
        unchecked.add(number3);
        System.out.println(removeDup(unchecked));
    }

    static int removeDup(ArrayList<Integer> a) {
        Collections.sort(a);

        int uniqueCnt = 0;
        for (int i = 0; i < a.size(); ++i) {
            if ((i == 0 || a.get(i) != a.get(i - 1)) && (i + 1 == a.size() || a.get(i) != a.get(i + 1))) {
                a.set(uniqueCnt++, a.get(i));
            }
        }
        a.subList(uniqueCnt, a.size()).clear();

        return getUniqueSum(a);
    }


    public static int getUniqueSum(ArrayList<Integer> a) {
        AtomicInteger sum = new AtomicInteger();
        a.forEach(sum::addAndGet);
        return sum.get();
    }
}
