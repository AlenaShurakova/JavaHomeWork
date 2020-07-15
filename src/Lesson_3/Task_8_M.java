package Lesson_3;

import java.util.Random;
/*
* Имеется целове число (задать с помощью Random rand = new Random(); int x =
rand.nextInt() ). Это число – количесво денег в рублях. Вывести это число, добавив к
нему слово «рублей» в правильном падеже.
* */

public class Task_8_M {
    public static void main(String[] args) {
        Random rand = new Random();
        int x = rand.nextInt();
        if (Math.abs(x) % 100 >= 11 && Math.abs(x) % 100 <= 19) {
            System.out.println(x + " рублей");
        } else if (Math.abs(x) % 10 == 1) {
            System.out.println(x + " рубль");
        } else if (Math.abs(x) % 10 == 2 || Math.abs(x) % 10 == 3 || Math.abs(x) % 10 == 4) {
            System.out.println(x + " рубля");
        } else {
            System.out.println(x + " рублей");
        }
    }
}
