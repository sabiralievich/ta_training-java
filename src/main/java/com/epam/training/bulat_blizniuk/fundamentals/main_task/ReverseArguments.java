package com.epam.training.bulat_blizniuk.fundamentals.main_task;

import java.util.ArrayList;
import java.util.List;
//2.     Отобразить в окне консоли аргументы командной строки в обратном порядке.
public class ReverseArguments extends MainTask {
    public static void main(String[] args) {
        System.out.println("Task #2");
        printArgumentsInReverseOrder();
    }

    static void printArgumentsInReverseOrder() {

        List<String> args = new ArrayList<>();
        String input = "";
        System.out.println("Input arguments line by line, when finish type 'exit'...");
        while ((!input.equals("exit") && (!input.equals("quit")))) {
            System.out.print("Type argument #" + (args.size() + 1) + " (or type 'exit'): ");
            input = inputCL();
            args.add(input);

        }
        for (int i = args.size() - 2; i >= 0; i--) {
            System.out.print(args.get(i) + " ");
        }
    }
}
