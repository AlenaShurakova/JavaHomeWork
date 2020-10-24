package lesson_12.additonalTask.task_2;

import java.util.ArrayList;
import java.util.Arrays;

public class TextFormater {
    public static int getNumberOfWordsInText(String text) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList(text.replaceAll("\\p{Punct}+", " ").split("\\s+")));
        return words.size();
    }

    public static boolean isPalindromeInString(String string) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList(string.replaceAll("\\p{Punct}+", " ").split("\\s+")));
        boolean isPalindromeInArray = false;
        for (String stringToCheck : words) {
            boolean isPalindromeInString = true;
            char[] wordChars = string.toCharArray();
            for (int i = 0; i < wordChars.length/2; i++) {
                if (wordChars[i]!=wordChars[wordChars.length-i-1]){
                    isPalindromeInString=false;
                }
            }
            if (isPalindromeInString){
                isPalindromeInArray=true;
            }
        }
        return isPalindromeInArray;
    }
}
