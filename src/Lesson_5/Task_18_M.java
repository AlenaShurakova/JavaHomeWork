package Lesson_5;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*Найти в строке не только запятые, но и другие знаки препинания. Подсчитать
общее их количество.*/

public class Task_18_M {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String input = scanner.nextLine();
        scanner.close();
        Pattern pattern = Pattern.compile("[\\p{Punct}]");
        Matcher matcher = pattern.matcher(input);
        int numberOfPunctMarks = 0;
        while (matcher.find()) {
            numberOfPunctMarks++;
        }
        System.out.println("Количество знаков припинания в строке: " + numberOfPunctMarks);
    }
}