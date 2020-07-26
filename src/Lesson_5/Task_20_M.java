package Lesson_5;

/*Имеется строка с текстом. Вывести текст, составленный из последних букв
всех слов.*/

import java.util.Scanner;

public class Task_20_M {
    public static void main(String[] args) {
        System.out.println("Введите строку:");
        Scanner scanner = new Scanner(System.in);
        String inputtedString = scanner.nextLine().replaceAll("[\\p{Punct}]", " ");
        scanner.close();
        String[] wordsList = inputtedString.split(" ");
        StringBuilder outputString = new StringBuilder();
        for (int i = 0; i < wordsList.length; i++) {
            if (wordsList[i].compareTo("") != 0) {
                outputString.append(wordsList[i].charAt(wordsList[i].length() - 1));
            }
        }
        System.out.println(outputString);
    }
}