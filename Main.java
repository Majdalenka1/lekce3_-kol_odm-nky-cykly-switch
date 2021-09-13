package com.engeto.ifloop;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] agrs) {
        System.out.println("---Example - read and print one integer ---");
        readOneIntAndPrintIt();

        System.out.println("---Task 1 - read and print integers until negative ---");
        readIntForUnputAndPrintItUntilNegative();

        System.out.println("---Task 2 - sum all integers until negative ---\"); ");
        System.out.println(" Total sum: " + sumAllInputUntilNegative());

        System.out.println("---Task 3 - read integers to list until negative ---");
        List<Integer> list = storeAllInputInArrayListUntilNegative();
        System.out.println(list);

        System.out.println("---Task 5 - sum all integers in list ---");
        System.out.println("Total sum: " + sumAllIntegersFromList(list));

        System.out.println("---Task 6 - print integers under 5 from list ---");
        printIntegerUnderlimit(list, 5);

        System.out.println("---Task 7 - print integers - replace: 1 => \"one\", 2 => \"two\", 3  => \"tree\" ---");
        printIntegerWithReplace(list);
    }

    public static void readOneIntAndPrintIt() {
        int input = Support.safeReadInt();
        System.out.println("You entered: " + input);
    }

    public static void readIntForUnputAndPrintItUntilNegative() {
        int input;
        do {
            input = Support.safeReadInt();
            if (input < 0) {
                break;
            }
            System.out.println("You entered: " + input);
        } while (true);
    }

    public static int sumAllInputUntilNegative() {
        int sum = 0, input = 0;
        do {
            input = Support.safeReadInt();
            if (input < 0) {
                break;
            }
            sum += input;
        } while (true);
        return sum;
    }

    public static List<Integer> storeAllInputInArrayListUntilNegative() {
        int input = 0;
        List<Integer> result = new ArrayList<>();
        do {
            input = Support.safeReadInt();
            if (input < 0) {
                break;
            }
            result.add(input);
        } while (true);
        return result;
    }

    public static void printAllIntegersFromList(List<Integer> list) {
        for (Integer i : list) {
            System.out.println(i);
        }
    }

    public static Integer sumAllIntegersFromList(List<Integer> list) {
        int result = 0;
        for (int i : list) {
            result += i;
        }
        return result;
    }

    public static void printIntegerUnderlimit(List<Integer> list, int limit) {
        for (Integer i : list) {
            if (i < limit) System.out.println(i);
        }
    }

    public static void printIntegerWithReplace(List<Integer> list) {
        for (Integer i : list) {
            switch (i) {
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                default:
                    System.out.println(i);
                    break;
            }
        }
    }
}