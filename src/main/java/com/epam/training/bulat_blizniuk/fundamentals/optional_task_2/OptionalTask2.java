package com.epam.training.bulat_blizniuk.fundamentals.optional_task_2;

import com.epam.training.bulat_blizniuk.fundamentals.main_task.MainTask;
import org.w3c.dom.ls.LSOutput;

import java.util.Random;

public class OptionalTask2 extends MainTask {

    private static int[][] matrix;

    public static void initiateMatrix() {
        System.out.println("Input size of the matrix (integer): ");
        setArgumentsFromCL();
        try {
            setMatrix(Integer.parseInt(getArgumentFromCL()));
        } catch (Exception e) {
            System.out.println("Input value should be an integer");
        }

        System.out.println("Input a number for range of matrix values [-M, M): ");
        setArgumentsFromCL();
        try {
            putValuesIntoMatrix(Integer.parseInt(getArgumentFromCL()));
        } catch (Exception e) {
            System.out.println("'M' Should be an Integer.");
        }

    }

    private static void putValuesIntoMatrix(int m) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = getRandomValues(m);
            }
        }
        System.out.println("Here is your matrix " + matrix.length + "x" + matrix.length + ":");
        printMatrix(matrix);

    }

    public static void printMatrix(int [][] matrix) {

        for (int[] anArr : matrix) {
            for (int anAnArr : anArr) {
                System.out.printf("%4d\t", anAnArr);
            }
            System.out.println();
        }
    }

    public static void setMatrix(int n) {
        matrix = new int[n][n];

    }

    private static int getRandomValues(int m) {
        Random random = new Random();
        return (-1 * m) + random.nextInt(m - (-1 * m) + 1);

    }

    public static int[][] getMatrix() {
        return matrix;
    }
}
