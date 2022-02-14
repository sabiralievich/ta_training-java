package com.epam.training.bulat_blizniuk.fundamentals.optional_task_2;

import java.util.Arrays;

public class DecreaseAndIncrease extends OptionalTask2{
    public static void main(String[] args) {
        initiateMatrix();
        getMaximumSequences(getMatrix());
    }

    private static void getMaximumSequences(int[][] matrix) {
        int[] byRow = new int[matrix.length * matrix.length];
        int c = 0;
        int r=0;
        int max=0;
        int h=0;
        int m=0;
        int min=0;
        int h1=0;
        for(int[] x : matrix){
            for(int z : x){
                byRow[c++] = z;
            }
        }
        for (int i = 0; i < byRow.length - 1; i++){
            if(byRow[i] < byRow[i+1]) {//если последующий элемент больше
                r += 1;
                if(r > max){
                    max = r;
                    h = i + 1;
                }//запоминаем количество возрастаний и индекс последнего возрастающего элем
            } else {
                r = 0;
            }//возрастание прервалась
            if(byRow[i] > byRow[i+1]){
                m += 1;
                if(m > min){
                    min = m;
                    h1 = i + 1;
                }//запоминаем количество возрастаний и индекс последнего убыв элем
            } else{
                m = 0;
            }// убывание прервалась
        }
        System.out.println("Максимальная последовательность возрастающих чисел:");
        int[] l = new int[max+1];
        System.arraycopy(byRow,(h - max), l,0,(max + 1));//копирую последовательность возр элем в новый массив
        System.out.println(Arrays.toString(l) + " " + (max + 1));
        System.out.println("Максимальная последовательность убывающих чисел:");
        int[] t = new int[min+1];
        System.arraycopy(byRow, (h1 - min), t,0,(min + 1));//копирую последовательность убыв элем в новый массив
        System.out.println(Arrays.toString(t) + " " + (min + 1));
    }
}
