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
        Iterator<String> iterator = words.iterator();
        while (iterator.hasNext()) {
            String nextElement = iterator.next();
            Integer frequency = 0;
            for (String s : words) {
                if (nextElement.equals(s)) {
                    frequency++;
                }
            }
            dictionary.put(nextElement, frequency);
        }
        System.out.println(dictionary);
    }
}
