package Lesson_3;/*
Имеется целое число, определить является ли это число простым, т.е.
делится без остатка только на 1 и себя.
* */

import java.util.Scanner;

public class Task_11_M {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число:");
        int x = scanner.nextInt();
        scanner.close();
        int counter = 0;
        for (int i = 1; i <= 9; i++) {
            if (x % i == 0) {
                counter++;
            }
        }
        if (x == 0) {
            System.out.println("0 не является ни простым, ни составным числом");
        } else if (counter > 2) {
            System.out.println("Число составное");
        } else {
            System.out.println("Число простое");
        }
    }
}
