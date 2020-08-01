package Lesson_3;

import java.util.Random;
import java.util.Scanner;

/*
Создать последовательность случайных чисел, найти и вывести наибольшее
из них.
* */

public class Task_13_M {
    public static  void main (String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество цифр в последовательности:");
        int numberOfNumbers = scanner.nextInt();
        scanner.close();
        Random random = new Random();
        int[] massive = new int[numberOfNumbers];
        for (int i = 0; i<=numberOfNumbers-1;i++)
        {
            massive[i]=random.nextInt();
        }
        for (int i=0;i<massive.length;i++)
        {
            System.out.println("Элемент "+ i + " равен " + massive[i]);
        }
        for (int max =0; max<massive.length-1;max++)
        {
            int last=max;
            for (int j=max+1; j<massive.length;j++){
                if (massive[j]>massive[last])
                {
                    last=j;
                }
            }
            int tmp = massive[max];
            massive[max]=massive[last];
            massive[last]= tmp;
        }
        System.out.println("Максимальное значение "+massive[0]);
    }
}
