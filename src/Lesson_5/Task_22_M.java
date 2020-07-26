package Lesson_5;
/*
* Написать программу, выполняющую поиск в строке шестнадцатеричных чисел,
записаных по правилам Java, с помощью регулярных выражений и вывести их на
страницу.
* */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_22_M {
    public static void main(String[] args) {
        String number = "0x1FfF is the first number 0x111AF is the second number";
        Pattern regexp = Pattern.compile("[0]{1}[x]{1}[a-fA-F0-9]{1,9}[a-fA-F]{0,6}");
        Matcher matcher = regexp.matcher(number);
        int counter=1;
        while(matcher.find()){
            System.out.println(counter+" number:"+matcher.group());
            counter++;
        }
    }
}