package Lesson_3;

import java.util.Scanner;

/*
Создать последовательность случайных чисел, найти и вывести наибольшее
из них.
* */

public class Task_13_M {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество цифр в последовательности:");
        int numberOfDigits = scanner.nextInt();
        scanner.close();
        int[] massive = new int[numberOfDigits];
        for (int i = 0; i < massive.length; i++) {
            massive[i] = (int) (Math.random() * 100);
        }
        for (int i = 0; i < massive.length; i++) {
            System.out.println("Элемент " + i + " равен " + massive[i]);
        }
        int maxNumber = 0;
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] >= maxNumber) {
                maxNumber = massive[i];
            }
        }
        System.out.println("Максимальное значение " + maxNumber);
    }
}
