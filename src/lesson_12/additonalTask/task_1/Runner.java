package lesson_12.additonalTask.task_1;

/*
1)В исходном файле находятся слова, каждое слово на новой стороке. После
запуска программы должен создать файл, который будет содержать в себе
только полиндромы
*/

import java.io.*;
import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) throws IOException {
        File initialFile = new File("src\\lesson_12\\additonalTask\\task_1", "textFile.txt");
        ArrayList<String> palindromeWords = getPalindromeWords(initialFile);
        writePolindromsToFile(palindromeWords);
    }

    private static ArrayList<String> getPalindromeWords(File file) throws IOException {
        BufferedReader br = null;
        ArrayList<String> wordsList = new ArrayList<>();
        try {
            br = new BufferedReader(new FileReader(file));
            String line = br.readLine();
            while (line != null) {
                if (isWordPalindrome(line)) {
                    wordsList.add(line);
                }
                line = br.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                br.close();
            }
        }
        return wordsList;
    }

    private static boolean isWordPalindrome(String word) {
        boolean isWordPalindrome = true;
        char[] wordChars = word.toLowerCase().toCharArray();
        for (int i = 0; i < wordChars.length / 2; i++) {
            if (wordChars[i] != wordChars[wordChars.length - i - 1]) {
                isWordPalindrome = false;
            }
        }
        return isWordPalindrome;
    }

    private static void writePolindromsToFile(ArrayList<String> wordsList) throws IOException {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(new File("src\\lesson_12\\additonalTask\\task_1", "fileWithPolindroms.txt")));
            for (String word : wordsList) {
                bw.write(word + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bw != null) {
                bw.close();
            }
        }
    }
}