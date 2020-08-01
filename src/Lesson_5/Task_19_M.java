package Lesson_5;

/*Имеется строка с текстом. Подсчитать количество слов в тексте. Желательно
учесть, что слова могут разделяться несколькими пробелами, в начале и конце
текста также могут быть пробелы, но могут и отсутствовать.*/

import java.util.Scanner;

public class Task_19_M {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String input = scanner.nextLine();
        scanner.close();
        String inputReplacedPunchMarks = input.replaceAll("[\\p{Punct}]", " ");
        String[] wordsList = inputReplacedPunchMarks.split(" ");
        int wordscount = 0;
        for (int i = 0; i < wordsList.length; i++) {
            if (wordsList[i].compareTo("") != 0) {
                wordscount++;
            }
        }
        System.out.println(wordscount);
    }
}