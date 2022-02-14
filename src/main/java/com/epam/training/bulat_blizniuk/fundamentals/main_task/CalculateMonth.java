package com.epam.training.bulat_blizniuk.fundamentals.main_task;

import java.util.HashMap;
import java.util.Map;

// 5.   Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу. Осуществить проверку корректности ввода чисел.
public class CalculateMonth extends MainTask{
    public static void main(String[] args) {

        System.out.println("task #5");
        inputMonth();
    }

    static void inputMonth() {

        Map<Integer, String> months = new HashMap<>();
        int num = 0;
        String errMsg = "Should be an Integer from 1 to 12";
        System.out.println("Type a number of a month required (1 - 12)...");
        {
            months.put(1, "January");
            months.put(2, "February");
            months.put(3, "March");
            months.put(4, "April");
            months.put(5, "May");
            months.put(6, "June");
            months.put(7, "July");
            months.put(8, "August");
            months.put(9, "September");
            months.put(10, "October");
            months.put(11, "November");
            months.put(12, "December");
        }
        try {
            num = Integer.parseInt(inputCL());
            if (num >= 1 && num <= 12) {
                System.out.println(months.get(num));
            } else System.out.println(errMsg);


        } catch (Exception e) {
            System.out.println(errMsg);
        }

    }

}
