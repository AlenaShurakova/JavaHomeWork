package Lesson_5;

/*Имеется строка с текстом. Подсчитать количество слов в тексте. Желательно
учесть, что слова могут разделяться несколькими пробелами, в начале и конце
текста также могут быть пробелы, но могут и отсутствовать.*/

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_19_M {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String input = scanner.nextLine();
        scanner.close();
        Pattern pattern = Pattern.compile("[\\p{Punct}]");
        String[] wordsList = input.split(" ");
        int wordscount = 0;
        for (int i = 0; i < wordsList.length; i++) {
            Matcher matcher = pattern.matcher(wordsList[i]);
            if (!matcher.matches() && wordsList[i].compareTo("") != 0) {
                wordscount++;
            }
        }
        System.out.println(wordscount);
    }
}