package com.epam.training.bulat_blizniuk.fundamentals.optional_task_1;

import com.epam.training.bulat_blizniuk.fundamentals.main_task.MainTask;

//        2.     Вывести числа в порядке возрастания (убывания) значений их длины.

public class SortByLength extends MainTask {
    public static void main(String[] args) {
        System.out.println("Task #2. Numbers are sorted by their length:" +
                "\nType numbers separated by SPACE and then press ENTER:"
        );
        setArgumentsFromCL();
        sortNumbersByLength(getArgumentFromCL());
    }

    // the method prints numbers sorted by their length:
    static void sortNumbersByLength(String args) {
        String[] numbers = parseStringToArrayOfIntegers(args);
        for (int i = numbers.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (numbers[j].length() > numbers[j + 1].length()) {
                    String tmp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = tmp;
                }
            }
        }
        System.out.println("Ascending order:");
        for (String number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println("\nDescending order:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}
