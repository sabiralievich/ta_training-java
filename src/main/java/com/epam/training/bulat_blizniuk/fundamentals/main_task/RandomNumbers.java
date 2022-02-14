package com.epam.training.bulat_blizniuk.fundamentals.main_task;

import java.util.Random;
//  3.     Вывести заданное количество случайных чисел с переходом и без перехода на новую строку
public class RandomNumbers extends MainTask{
    public static void main(String[] args) {
        System.out.println("task #3. Please Enter an Integer - quantity of random numbers required");
        try {
            printRandomNums(Integer.parseInt(inputCL()));
        } catch (Exception e) {
            System.out.println("Please enter an integer");
        }
    }

    static void printRandomNums(int m) {
        Random random = new Random();
        int[] numbers = new int[m];
        for (int i = 0; i < m; i++) {
            int n = random.nextInt(100);
            numbers[i] = n;
        }

        System.out.println("Output of " + m + " random numbers with println():");
        for (int n : numbers) {
            System.out.println(n);
        }
        System.out.println("Output of " + m + " random numbers with print():");
        for (int n : numbers) {
            System.out.print(n + " ");
        }

    }
}
