package Lesson_3;

/*
*Напишите программу, определяющую сумму всех нечетных чисел от 1до 99
* */
public class Task_7 {
    public static void main(String [] args)
    {
        int sum = 0;
        for(int i=1; i<=99;i++)
        {
            if(i%2!=0)
            {
               sum+=i;
            }
        }
        System.out.println(sum);
    }
}
