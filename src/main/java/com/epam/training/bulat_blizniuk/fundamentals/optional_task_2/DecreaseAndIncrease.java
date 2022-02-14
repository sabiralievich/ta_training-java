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
            if(byRow[i] < byRow[i+1]) {
                r += 1;
                if(r > max){
                    max = r;
                    h = i + 1;
                }
            } else {
                r = 0;
            }
            if(byRow[i] > byRow[i+1]){
                m += 1;
                if(m > min){
                    min = m;
                    h1 = i + 1;
                }
            } else{
                m = 0;
            }
        }
        System.out.println("Maximum ascending sequence: ");
        int[] l = new int[max+1];
        System.arraycopy(byRow,(h - max), l,0,(max + 1));
        System.out.println(Arrays.toString(l) + " " + (max + 1) + " numbers");
        System.out.println("Maximum descending sequence: ");
        int[] t = new int[min+1];
        System.arraycopy(byRow, (h1 - min), t,0,(min + 1) );
        System.out.println(Arrays.toString(t) + " " + (min + 1)+ " numbers");
    }
}
