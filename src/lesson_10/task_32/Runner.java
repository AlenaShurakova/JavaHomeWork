package lesson_10.task_32;

/*
Имеется текст. Следует составить для него частотный словарь.
* */

import java.util.*;

public class Runner {
    public static void main(String[] args) {
        String text = "Lorem lorem Ipsum -is simple, very very very dummy text!";
        ArrayList<String> words = new ArrayList<String>(Arrays.asList(text.toLowerCase().replaceAll("\\p{Punct}+", " ").split("\\s+")));
        System.out.println("Список слов:" + words);
        Map<String, Integer> dictionary = new HashMap<>();
        for (String s : words) {
            if (dictionary.keySet().contains(s)) {
                dictionary.put(s,dictionary.get(s)+1);
            } else {
                dictionary.put(s, 1);
            }
        }
        System.out.println(dictionary);
    }
}
