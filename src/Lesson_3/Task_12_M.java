package Lesson_3;

import java.util.Random;
import java.util.Scanner;

/*
* Найдите сумму первых n целых чисел, которые делятся на 3.
* */
public class Task_12_M {
    public static  void main (String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел: ");
        int inputtedValue = scanner.nextInt();
        scanner.close();
        int [] massive = new int[inputtedValue];
        int sum=0;
        Random random = new Random();
        for (int i=0; i<=massive.length-1;i++)
        {
            massive[i]=random.nextInt();
            if (massive[i]%3==0)
            {
                sum+=massive[i];
            }
        }
        System.out.println("Сумма равна: "+sum);
    }
}
