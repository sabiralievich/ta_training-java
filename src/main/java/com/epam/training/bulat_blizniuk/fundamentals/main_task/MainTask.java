package com.epam.training.bulat_blizniuk.fundamentals.main_task;

import java.util.*;
/*
            Реализовать следующие программы:
            1.     Приветствовать любого пользователя при вводе его имени через командную строку.
            2.     Отобразить в окне консоли аргументы командной строки в обратном порядке.
            3.     Вывести заданное количество случайных чисел с переходом и без перехода на новую строку
            4.     Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.
            5.   Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу. Осуществить проверку корректности ввода чисел.
*/
public class MainTask {
    private static String argumentsFromCL;

      public static String inputCL() {
        Scanner scanner = new Scanner(System.in);
        argumentsFromCL = scanner.nextLine();
        return argumentsFromCL;
    }

    public static String[] parseStringToArrayOfIntegers(String args) {
        return args.split(" ");
    }

    public static void setArgumentsFromCL() {
          argumentsFromCL = inputCL();
    }

    public static String getArgumentFromCL() {
          return argumentsFromCL;
    }


}
