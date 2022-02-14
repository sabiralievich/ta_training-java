package com.epam.training.bulat_blizniuk.fundamentals.optional_task_2;

//  Упорядочить строки (столбцы) матрицы в порядке возрастания значений элементов k-го столбца (строки).

public class SortRowsAndColumnsByValue extends OptionalTask2 {
    private static boolean sortable = true;

    public static void main(String[] args) {
        initiateMatrix();
        System.out.println("Input column(row) number to sort the matrix 1 to " + getMatrix().length);
        setArgumentsFromCL();
        try {
            sortRowsByColumnValue(Integer.parseInt(getArgumentFromCL()));
            sortColumnsByRowValue(Integer.parseInt(getArgumentFromCL()));
        } catch (Exception e) {
            System.out.println("Should be a number between 1 " + getMatrix().length);
        }
    }

    // the method sorts a matrix by specified column values
    private static void sortRowsByColumnValue(int k) {

        int[][] matrix = getMatrix();
        while (sortable) {
            sortable = false;

            for (int i = 1; i < matrix.length; i++) {
                if (matrix[i][k - 1] < matrix[i - 1][k - 1]) {
                    sortable = true;

                    int[] tmp = matrix[i];
                    matrix[i] = matrix[i - 1];
                    matrix[i - 1] = tmp;
                }
            }
        }
        System.out.println("\nSorted by " + k + "th column:");
        printMatrix(matrix);

    }

    // the method sorts a matrix by specified row values
    private static void sortColumnsByRowValue(int k) {
        int[][] matrix = getMatrix();
        sortable = true;

        while (sortable) {
            sortable = false;
            for (int i = 0; i < matrix.length - 1; i++) {
                if (matrix[k-1][i] > matrix[k-1][i + 1]) {
                    for (int j = 0; j < matrix.length; j++) {
                        sortable = true;

                        int tmp = matrix[j][i];
                        matrix[j][i] = matrix[j][i + 1];
                        matrix[j][i + 1] = tmp;
                    }
                }
            }
        }
        System.out.println("\nSorted by " + k + "th row:");
        printMatrix(matrix);

    }


}
