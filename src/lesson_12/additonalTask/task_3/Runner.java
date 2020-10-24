package lesson_12.additonalTask.task_3;

/*
3) Проверка на цензуру:
Создаете 2 файла.
1 - й. Содержит исходный текст.
2 - й. Содержит слова недопустимые в тексте(black list). Структура файла
определите сами, хотите каждое слово на новой строке, хотите через запятую
разделяйте, ваша программа делайте как считаете нужным.
Задача: необходимо проверить проходит ли текст цензуру. Если в тексте не
встретилось ни одного недопустимого слова, то выводите сообщение о том что
текст прошёл проверку на цензуру. Если нет, то выводите соответствуюущее
сообщение, кол-во предложений не прошедших проверку и сами предложения
подлежащие исправлению.

* */

import java.io.*;
import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) throws IOException {
        File blackListedWordsFile = new File("blackList.txt");
        File textFile = new File("businessLetter.txt");
        censorChecker(textFile, blackListedWordsFile);
    }

    public static void censorChecker(File fileToBeChecked, File fileWithCensoredWords) throws IOException {
        int numberOfCensoredSentences = 0;
        ArrayList<String> listOfSentencesInText = getListOfSentencesInText(fileToBeChecked);
        for (String s : listOfSentencesInText) {
            if (isSentenceContainsBadWord(s, fileWithCensoredWords)) {
                System.out.println("Следующее предложение содержит недопустимое слово: " + s);
                numberOfCensoredSentences++;
            }
        }
        System.out.print("Количество предложений, не прошедших проверку:" + numberOfCensoredSentences);
        if (numberOfCensoredSentences == 0) {
            System.out.print(listOfSentencesInText);
        }
    }

    private static ArrayList<String> getListOfSentencesInText(File file) throws IOException {
        ArrayList<String> listOfSentences = new ArrayList<>();
        String textOfFile = "";
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line = br.readLine();
            while (line != null) {
                textOfFile += line;
                line = br.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        for (String s : textOfFile.split("(\\.+)|(\\!+)|(\\?+)")) {
            listOfSentences.add(s);
        }
        return listOfSentences;
    }

    private static boolean isSentenceContainsBadWord(String string, File fileWithBadWords) throws IOException {
        ArrayList<String> listOfBadWords = getListOfBadWords(fileWithBadWords);
        boolean isSentenceContainsBadWords = false;
        for (String s : listOfBadWords) {
            if (string.toLowerCase().contains(s)) {
                isSentenceContainsBadWords = true;
            }
        }
        return isSentenceContainsBadWords;
    }

    private static ArrayList<String> getListOfBadWords(File file) throws IOException {
        BufferedReader br = null;
        ArrayList<String> listOfBadWords = new ArrayList<>();
        try {
            br = new BufferedReader(new FileReader(file));
            String line = br.readLine();
            while (line != null) {
                listOfBadWords.add(line);
                line = br.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                br.close();
            }
        }
        return listOfBadWords;
    }
}