package com.epam.training.bulat_blizniuk.fundamentals.optional_task_1;

import com.epam.training.bulat_blizniuk.fundamentals.main_task.MainTask;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

//         4.     Найти число, в котором количество различных цифр минимально.
//         Если таких чисел несколько, найти первое из них.

public class NumberWithMinimumDifferentDigits extends MainTask {
    public static void main(String[] args) {
        System.out.println(
                "Task #4. Find a number with minimum different digits. " +
                "\nType numbers separated by SPACE and then press ENTER:"
            );
        setArgumentsFromCL();
        findNumberWithMinimumDifferentDigits(getArgumentFromCL());
    }

    // the method search for the number where the count of different digits is minimum
    private static void findNumberWithMinimumDifferentDigits(String args) {
        String[] numbers = parseStringToArrayOfIntegers(args);
        TreeMap<Integer, String> searchMap = new TreeMap<>();
        int minimumDigits;
        String requiredNumber = "";
        for (String s : numbers) {
            minimumDigits = countChars(s.toCharArray());
            searchMap.put(minimumDigits, s);
        }
        System.out.println(
                "The number with the minimum different digits is " +
                        searchMap.firstEntry().getValue() + ". It has " +
                        searchMap.firstKey() + " different digits"
        );
    }

    // the method returns count of unique elements of char array
    private static int countChars(char[] chars) {
        int count = 1;
        Arrays.sort(chars);
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] != chars[i - 1]) {
                count++;
            }
        }
        return count;
    }
}
