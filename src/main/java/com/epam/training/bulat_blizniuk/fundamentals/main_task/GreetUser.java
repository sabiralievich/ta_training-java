package com.epam.training.bulat_blizniuk.fundamentals.main_task;
//  1.     Приветствовать любого пользователя при вводе его имени через командную строку.
public class GreetUser extends MainTask{

    public static void main(String[] args) {
        System.out.println("Task #1");
        String userName = inputCL();
        printUserHello(userName);
    }

    static void printUserHello(String userName) {

        System.out.println("Hello, " + userName);
    }
}
