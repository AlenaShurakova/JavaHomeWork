package lesson_12.task_33;

/*
Создать файл с текстом, прочитать, подсчитать в тексте количество знаков
препинания и слов.
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Runner {
    public static void main(String[] args) throws IOException {
        String textToWrite = "Hello, World!";
        File task33 = new File("task33.txt");
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(task33));) {
            bw.write(textToWrite);
        } catch (IOException ex) {
            System.out.print(ex.getMessage());
        }
        try (BufferedReader br = new BufferedReader(new FileReader(task33));) {
            String textInDocument = "";
            String lineInDocument;
            while ((lineInDocument = br.readLine()) != null) {
                textInDocument += lineInDocument;
            }
            System.out.println("Text in the document: " + textInDocument);
            System.out.println("Number of words in the string: " + getNumberOfWordsInText(textInDocument));
            System.out.println("Number of punctuation symbols: " + getNumberOfPunctSymbolsInText(textInDocument));
        } catch (IOException e) {
            System.out.print(e.getMessage());
        }
    }

    private static int getNumberOfWordsInText(String text) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList(text.replaceAll("\\p{Punct}+", " ").split("\\s+")));
        return words.size();
    }

    private static int getNumberOfPunctSymbolsInText(String text) {
        int numberOfPunchtSymbols = 0;
        char[] chars = text.toCharArray();
        for (char i : chars) {
            if (Character.toString(i).matches("\\p{Punct}+")) {
                numberOfPunchtSymbols++;
            }
        }
        return numberOfPunchtSymbols;
    }
}