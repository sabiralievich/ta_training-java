package com.epam.training.bulat_blizniuk.fundamentals.optional_task_1;

import com.epam.training.bulat_blizniuk.fundamentals.main_task.MainTask;

//         3.     Вывести на консоль те числа, длина которых меньше (больше)
//         средней длины по всем числам, а также длину.

public class CompareLengthToAverage extends MainTask {
    public static void main(String[] args) {
        System.out.println(
                "Task #3. Compare numbers length with average. " +
                        "\nType numbers separated by SPACE and then press ENTER:"
        );
        setArgumentsFromCL();
        compareLengthWithAverage(getArgumentFromCL());
    }

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

        for (String number : numbers) {
            if (number.length() <= averageLength) {
                less
                        .append("Number ")
                        .append(number)
                        .append(" has length ")
                        .append(number.length())
                        .append("; ");
            }
        }
        System.out.println(less);

        for (String number : numbers) {
            if (number.length() > averageLength) {
                more.append("Number ").append(number).append(" has length ").append(number.length()).append("; ");
            }
        }
        System.out.println(more);
    }
}
