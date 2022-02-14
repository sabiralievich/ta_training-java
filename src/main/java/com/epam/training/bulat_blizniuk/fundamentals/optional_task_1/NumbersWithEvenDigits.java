package com.epam.training.bulat_blizniuk.fundamentals.optional_task_1;

import com.epam.training.bulat_blizniuk.fundamentals.main_task.MainTask;

import java.util.ArrayList;
import java.util.List;

//         5.     Найти количество чисел, содержащих только четные цифры,
//         а среди оставшихся — количество чисел с равным числом четных и нечетных цифр.
public class NumbersWithEvenDigits extends MainTask {
    public static void main(String[] args) {
        System.out.println(
                "Task #5. Odd and even digits" +
                        "\nType numbers separated by SPACE and then press ENTER:"
        );
        setArgumentsFromCL();
        findNumbersWithEvenDigitsOnly(getArgumentFromCL());
    }

    // the method prints numbers with even digits only
    private static void findNumbersWithEvenDigitsOnly(String args) {
        String[] numbers = parseStringToArrayOfIntegers(args);
        List<String> evens = new ArrayList<>();
        List<String> notEvens = new ArrayList<>();
        int count = 0;

        for (String s : numbers) {
            if (hasEvenOnly(s)) {
                evens.add(s);
            } else {
                notEvens.add(s);
            }
        }
        System.out.println("The q-ty of numbers which contain even digits only is " + evens.size());


        for (String s : notEvens) {
            if (findNumberOfEqualOddAndEvenDigits(s)) {
                count++;
            }
        }
        System.out.println("The q-ty of numbers with equal Odd and Even digits is " + count);
    }

    // the method returns true if the srting contains only even digits
    private static boolean hasEvenOnly(String s) {
        char[] chars = s.toCharArray();
        boolean result = true;
        for (char aChar : chars) {
            switch (aChar) {
                case '1', '3', '5', '7', '9' -> {
                    return false;

                }

                default -> {
                }
            }
        }
        return result;
    }

    // the method defines q-ty of numbers with equal of Odd and Even digits
    private static boolean findNumberOfEqualOddAndEvenDigits(String s) {
        int count = 0;
        int odd = 0;
        int even = 0;
        char[] chars = s.toCharArray();
        if (chars.length % 2 == 0) {
            for (char ch : chars) {
                switch (ch) {
                    case '1', '3', '5', '7', '9' -> odd++;
                    default -> even++;
                }
            }
        } else {
            return false;
        }
        return odd == even;

    }
}
