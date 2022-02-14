package com.epam.training.bulat_blizniuk.fundamentals.optional_task_1;

import com.epam.training.bulat_blizniuk.fundamentals.main_task.MainTask;
import java.util.Arrays;

//         7.     Найти число, состоящее только из различных цифр.
//         Если таких чисел несколько, найти первое из них.

public class NumberWithDifferentDigits extends MainTask {
    public static void main(String[] args) {
        System.out.println(
                "Task #7. To find a number consisting of different digits only" +
                "\nType numbers separated by SPACE and then press ENTER:"
        );
        setArgumentsFromCL();
        findNumberWithDifferentDigits(getArgumentFromCL());
    }
    // the method search for a number consisting of different digits only
    private static void findNumberWithDifferentDigits(String args) {
        String[] numbers = parseStringToArrayOfIntegers(args);
        String result = "";
        for (String s : numbers) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            for (int i = 1; i < chars.length; i++) {

                if (chars[i] == chars[i - 1]) {
                    result = "";
                    break;
                } else {
                    result = s;
                }
            }
            if (!result.equals("")) break;
        }
        System.out.println("The number with all different digits is: " + result);
    }
}
