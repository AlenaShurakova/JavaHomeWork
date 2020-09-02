package lesson_3;

/*
Посчитать факториал числа в границах от 10 до 15 (не используя рекурсию).
* */
public class Task_10_M {
    public static void main (String [] args)
    {
        int x = 10;
        int result=1;
        while (x<=15)
        {
            result*=x;
            x++;
        }
        System.out.println(result);
    }
}
