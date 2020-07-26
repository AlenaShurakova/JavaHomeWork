package Lesson_5;
/*
* Написать программу, выполняющую поиск в строке шестнадцатеричных чисел,
записаных по правилам Java, с помощью регулярных выражений и вывести их на
страницу.
* */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_22_M {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String alena = "0xaaaaaaaa";
        scanner.close();
        Pattern regexp = Pattern.compile("[0]{1}[x]{1}[a-f0-9]{1,9}[a-f]{0,6}");
        Matcher m = regexp.matcher(alena.toLowerCase());
        boolean b = m.matches();
        System.out.println(b);
    }
}
