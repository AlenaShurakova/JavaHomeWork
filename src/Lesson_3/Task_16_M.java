package Lesson_3;

import java.util.Scanner;

/*Определите сумму элементов одномерного массива, расположенных между
минимальным и максимальным значениями.
* */
public class Task_16_M {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int sizeOfMassive = scanner.nextInt();
        scanner.close();
        int[] massive = new int[sizeOfMassive];
        for (int i = 0; i < massive.length; i++) {
            massive[i] = (int) (Math.random() * 100);
        }
        int maxIndex = 0;
        int minIndex = 0;
        int maxNumber = 0;
        int minNumber = 99;
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] >= maxNumber) {
                maxNumber = massive[i];
                maxIndex = i;
            }
            if (massive[i] <= minNumber) {
                minNumber = massive[i];
                minIndex = i;
            }
        }
        System.out.println("Массив состоит из следующий элементов': ");
        for (int i = 0; i < massive.length; i++) {
            System.out.print(massive[i] + " ");
        }
        System.out.println("\nМаксимальное значение: " + maxNumber + ", его номер (индекс):" + maxIndex);
        System.out.println("Минимальное значение: " + minNumber + ", его номер (индекс):" + minIndex);
        int sumOfElements = 0;
        int lessIndex;
        int greaterIndex;
        if (minIndex < maxIndex) {
            lessIndex = minIndex;
            greaterIndex = maxIndex;
        } else {
            lessIndex = maxIndex;
            greaterIndex = minIndex;
        }
        if ((greaterIndex - lessIndex) == 1) {
            System.out.println("Между максимальным и минимальным элементами нет других элементов");
        } else {
            for (int i = lessIndex + 1; i < greaterIndex; i++) {
                sumOfElements += massive[i];
            }
            System.out.println("Сумма элементов, расположенных между максимальным и минимальным элементами составляет" + sumOfElements);
        }
    }
}