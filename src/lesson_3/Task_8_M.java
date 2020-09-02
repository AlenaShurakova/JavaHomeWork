package lesson_3;

import java.util.Random;
/*
* Имеется целове число (задать с помощью Random rand = new Random(); int x =
rand.nextInt() ). Это число – количесво денег в рублях. Вывести это число, добавив к
нему слово «рублей» в правильном падеже.
* */

public class Task_8_M {
    public  static  void main(String[] args) {
        Random rand = new Random();
        int x = rand.nextInt();
        int numberOfChars = (Integer.toString(x)).length();
        int divider = 1;
        if (x < 0) {
            numberOfChars -= 1;
        }
        for (int i = 1; i <numberOfChars; i++) {
            divider *= 10;
        }
        if (numberOfChars==1)
        {
            divider=10;
        }
        if (Math.abs(x) % divider == 0 || Math.abs(x) >= 11 && Math.abs(x)<=19) {
            System.out.println(x + " рублей");
        } else if (Math.abs(x) % divider == 1) {
            System.out.println(x + " рубль");
        } else if (Math.abs(x) % divider == 2 || Math.abs(x) % divider == 3 || Math.abs(x) % divider == 4) {
            System.out.println(x+" рубля");
        }
        else {
            System.out.println(x+" рублей");
        }
    }
}
