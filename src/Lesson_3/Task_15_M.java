package Lesson_3;

import java.util.Scanner;

/*
* Создать массив, заполнить его случайными элементами, распечатать,
перевернуть, и снова распечатать (при переворачивании нежелательно создавать
еще один массив).
* */
public class Task_15_M {
    public static void main (String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int sizeOfMassive = scanner.nextInt();
        scanner.close();
        int massive[] = new int[sizeOfMassive];

        System.out.println("Оригинальный массив: ");
        for (int i = 0; i < sizeOfMassive; i++) {
            massive[i] = (int) (Math.random() * 100);
            System.out.print(" " + massive[i]);
        }
        for (int i = 0; i < sizeOfMassive / 2; i++) {
            int z = massive[i];
            massive[i] = massive[sizeOfMassive - 1 - i];
            massive[sizeOfMassive - 1 - i] = z;
        }
        System.out.println("\nПеревернутый массив: ");
        for (int i = 0; i < sizeOfMassive; i++) {
            System.out.print(" " + massive[i]);
        }

    }
}
