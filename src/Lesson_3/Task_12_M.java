package Lesson_3;

import java.util.Scanner;

/*
 * Найдите сумму первых n целых чисел, которые делятся на 3.
 * */

public class Task_12_M {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел: ");
        int inputtedNumber = scanner.nextInt();
        scanner.close();
        int sumOfNumbers = 0;
        int numberCounter = 0;
        int numberIncrement = 0;
        while (numberCounter < inputtedNumber) {
            if (numberIncrement % 3 == 0) {
                sumOfNumbers += numberIncrement;
                numberCounter++;
            }
            numberIncrement++;
        }
        System.out.println(sumOfNumbers);
    }
}
