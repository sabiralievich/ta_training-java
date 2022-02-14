package com.epam.training.bulat_blizniuk.fundamentals.optional_task_1;

import com.epam.training.bulat_blizniuk.fundamentals.main_task.MainTask;

public class LongestAndShortest extends MainTask {

    public static void main(String[] args) {
        System.out.println("Task #1. The longest and the shortest numbers:");
        setArgumentsFromCL();
        getLongestString(getArgumentFromCL());
        getShortestString(getArgumentFromCL());
    }

    // the method prints the longest string:
    static void getLongestString(String args) {
        String[] numbers = parseStringToArrayOfIntegers(args);
        int max = numbers[0].length();
        String longest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i].length() > max) {
                max = numbers[i].length();
                longest = numbers[i];
            }
        }
        System.out.println("The longest number is " + longest + ", it has " + max + " digits");
    }

    // the method prints the shortest string:
    static void getShortestString(String args) {
        String[] numbers = parseStringToArrayOfIntegers(args);
        int min = numbers[0].length();
        String shortest = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i].length() < min) {
                min = numbers[i].length();
                shortest = numbers[i];
            }
        }
        System.out.println("The shortest number is " + shortest + ", it has " + min + " digits");
    }

}
