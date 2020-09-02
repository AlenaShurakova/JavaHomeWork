package lesson_3;

import java.util.Scanner;

/*
*Имеется прямоугольное отверстие размерами a и b, определить, можно ли его
полностью закрыть круглой картонкой радиусом r.
* */
public class Task_7_M {
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите a:");
        int a = input.nextInt();
        System.out.println("Введите b:");
        int b = input.nextInt();
        System.out.println("Введите r:");
        int r = input.nextInt();
        input.close();
        double diagonal = Math.sqrt(a*a + b*b);
        if (r>=diagonal/2)
        {
           System.out.println("Прямоугольник можно закрыть картонкой");
        }
        else
        {
            System.out.println("Прямоугольник нельзя закрыть картонкой");
        }
    }
}
