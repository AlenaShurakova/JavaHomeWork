package Lesson_3;

import java.util.Scanner;

/*
*Создайте число. Определите, является ли число трехзначным. Определите, является
ли его последняя цифра семеркой. Определите, является ли число четным.
* */
public class Task_6_M {
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = input.nextInt();
        input.close();
        int amountOfNumbers = (Integer.toString(number)).length();
        if(number<0)
        {
            amountOfNumbers-=1;
        }
        if(amountOfNumbers==3)
        {
            System.out.println("Число трехзначное");
        }
        else
        {
            System.out.println("Число не трехзначное");
        }
        if ((number-7)%10==0)
        {
            System.out.println("Число заканчивается на 7");
        }
        else
        {
            System.out.println("Число не заканчивается на 7");
        }
        if (number==0)
        {
            System.out.println("Число не является ни четным, ни нечетным");
        }
        else if (number%2==0)
        {
            System.out.println("Число четное");
        }
        else
        {
            System.out.println("Число нечетное");
        }
    }
}
