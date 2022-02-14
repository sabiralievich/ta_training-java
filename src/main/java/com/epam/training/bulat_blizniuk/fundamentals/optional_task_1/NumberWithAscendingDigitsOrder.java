package com.epam.training.bulat_blizniuk.fundamentals.optional_task_1;

import com.epam.training.bulat_blizniuk.fundamentals.main_task.MainTask;

//        6.     Найти число, цифры в котором идут в строгом порядке возрастания.
//        Если таких чисел несколько, найти первое из них.

public class NumberWithAscendingDigitsOrder extends MainTask {
    public static void main(String[] args) {
        System.out.println(
                "Task #6. The number with Ascending digits order" +
                "\nType numbers separated by SPACE and then press ENTER:"
        );
        setArgumentsFromCL();
        findNumberWithAscendingDigitsOrder(getArgumentFromCL());
    }

    // the method search a number with ascending digits order
    private static void findNumberWithAscendingDigitsOrder(String args) {
        String[] numbers = parseStringToArrayOfIntegers(args);
        boolean result = true;
        String requiredString = "";
        for (String s : numbers) {
            char[] chars = s.toCharArray();
            for (int i = 1; i < chars.length; i++) {
                if (chars[i] > chars[i - 1]) {
                    requiredString = s;
                } else {
                    requiredString = "";
                    break;
                }
            }
            if (!requiredString.equals("")) break;
        }
        System.out.println("The number with Ascending digits order is " + requiredString);
    }
}
