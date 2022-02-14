package com.epam.training.bulat_blizniuk.fundamentals.optional_task_1;

import java.util.*;


/*
Задание. Ввести n чисел с консоли.
        1.     Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
        2.     Вывести числа в порядке возрастания (убывания) значений их длины.
        3.     Вывести на консоль те числа, длина которых меньше (больше) средней длины по всем числам, а также длину.
        4.     Найти число, в котором количество различных цифр минимально. Если таких чисел несколько, найти первое из них.
        5.     Найти количество чисел, содержащих только четные цифры, а среди оставшихся — количество чисел с равным числом четных и нечетных цифр.
        6.     Найти число, цифры в котором идут в строгом порядке возрастания. Если таких чисел несколько, найти первое из них.
        7.     Найти число, состоящее только из различных цифр. Если таких чисел несколько, найти первое из них.
*/
public class OptionalTask1 {
    static String argumentsFromCL;

    public static void main(String[] args) {
        System.out.println("Input numbers separated by SPACE and press INPUT");
        argumentsFromCL = inputCL();
  //      task1();
  //      task2();
 //       task3();
//        task4();
 //       task5();
//        task6();
//        task7();
    }

    // The method returns a string from CL
    static String inputCL() {
        Scanner scanner = new Scanner(System.in);
        String argumentsFromCL = scanner.nextLine();
        return argumentsFromCL;
    }
/*
    //  Here Task #1 starts
    static void task1() {
        System.out.println("Task #1. The longest and the shortest numbers:");
        getLongestString(argumentsFromCL);
        getShortestString(argumentsFromCL);
    }

    //  Here Task #2 starts
    static void task2() {
        System.out.println("");
        System.out.println("Task #2. Numbers are sorted by their length:");
        sortNumbersByLength(argumentsFromCL);
    }*/

    //  Here Task #3 starts
    static void task3() {
        System.out.println("");
        System.out.println("");
        System.out.println("Task #3. Compare numbers length with average:");
        compareLengthWithAverage(argumentsFromCL);
    }

    //  Here Task #4 starts
    static void task4() {
        System.out.println("");
        System.out.println("Task #4. Find a number with minimum different digits");
        findNumberWithMinimumDifferentDigits(argumentsFromCL);
    }

    // Here Task #5 starts
    static void task5() {
        System.out.println("");
        System.out.println("Task #5. Odd and even digits");
        findNumbersWithEvenDigitsOnly(argumentsFromCL);
    }

    // Here Task #6 starts
    static void task6() {
        System.out.println("");
        System.out.println("Task #6. The number with Ascending digits order");
        findNumberWithAscendingDigitsOrder(argumentsFromCL);

    }

    // Here Task #7 starts
    static void task7() {
        System.out.println("");
        System.out.println("Task #7. To find a number consisting of different digits only");
        findNumberWithDifferentDigits(argumentsFromCL);
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
        System.out.println(requiredString);
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
        if (odd == even) {
            return true;
        } else {
            return false;
        }

    }

    // the method returns true if the srting contains only even digits
    private static boolean hasEvenOnly(String s) {
        char[] chars = s.toCharArray();
        boolean result = true;
        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case '1', '3', '5', '7', '9' -> {
                    return false;

                }

                default -> result = true;
            }
        }
        return result;
    }

    // the method search for the number where the count of different digits is minimum
    private static void findNumberWithMinimumDifferentDigits(String args) {
        String[] numbers = parseStringToArrayOfIntegers(args);
        Map<Integer, String> searchMap = new TreeMap<Integer, String>();
        int minimumDigits = 0;
        String requiredNumber = "";
        for (String s : numbers) {
            minimumDigits = countChars(s.toCharArray());
            searchMap.put(minimumDigits, s);
        }
        System.out.println(
                "The number with the minimum different digits is " +
                        ((TreeMap<Integer, String>) searchMap).firstEntry().getValue() + ". It has " +
                        ((TreeMap<Integer, String>) searchMap).firstKey() + " different digits"
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

    // the method compares length of number with average length of all elements
    private static void compareLengthWithAverage(String args) {
        String[] numbers = parseStringToArrayOfIntegers(args);
        double averageLength = numbers[0].length();
        StringBuilder less = new StringBuilder("Numbers with the length lesser than average: ");
        StringBuilder more = new StringBuilder("Numbers with the length greater than average: ");
        for (int i = 1; i < numbers.length; i++) {
            averageLength += numbers[i].length();
        }
        averageLength /= numbers.length;
        System.out.println("Average Length of numbers is " + averageLength);

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i].length() <= averageLength) {
                less
                        .append("Number ")
                        .append(numbers[i])
                        .append(" has length ")
                        .append(numbers[i].length())
                        .append("; ");
            }
        }
        System.out.println(less);

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i].length() > averageLength) {
                more.append("Number ").append(numbers[i]).append(" has length ").append(numbers[i].length()).append("; ");
            }
        }
        System.out.println(more);
    }

    // The method splits a String (numbers separated by spacings) into an array of Strings:
    static String[] parseStringToArrayOfIntegers(String args) {
        String[] result = args.split(" ");
        return result;
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
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("");
        System.out.println("Descending order:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}
