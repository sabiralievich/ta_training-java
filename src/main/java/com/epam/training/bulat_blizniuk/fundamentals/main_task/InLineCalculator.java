package com.epam.training.bulat_blizniuk.fundamentals.main_task;

import java.util.ArrayList;
import java.util.List;

public class InLineCalculator extends MainTask{
    public static void main(String[] args) {
        System.out.println("task #4");
        calculateNumbersFromCommandLine();
    }
    static void calculateNumbersFromCommandLine() {

        List<Integer> args = new ArrayList<>();
        String input = "";
        int sum = 0, product = 1;
        System.out.println("Input numbers line by line, when finish type 'exit'...");
        while (!input.equals("exit")) {
            System.out.print("Type argument #" + (args.size() + 1) + " or type 'exit': ");
            input = inputCL();
            try {
                if (!input.equals("exit")) {
                    int number = Integer.parseInt(input);
                    args.add(number);
                }
            } catch (Exception e) {
                System.out.println("Wrong argument, should be an INTEGER");
            }

        }
        for (int i = 0; i < args.size(); i++) {
            sum += args.get(i);
            product *= args.get(i);
        }

        System.out.println("Sum of input numbers is " + sum);
        System.out.println("Product of input nimbers is " + product);
    }
}
