package lesson_12.additonalTask.task_2;

import java.io.*;
import java.util.ArrayList;

/*2)Текстовый файл содержит текст. После запуска программы в другой файл
должны записаться только те предложения в которых от 3-х до 5-ти слов. Если в
предложении присутствует слово-палиндром, то не имеет значения какое кол-во
слов в предложении, оно попадает в новый файл.

Пишем все в ООП стиле. Создаём класс TextFormater
в котором два статических метода:
1. Метод принимает строку и возвращает кол-во слов в строке.
2. Метод принимает строку и проверяет есть ли в строке слово-палиндром. Если
есть возвращает true, если нет false

В main считываем файл.
Разбиваем текст на предложения. Используя методы класса TextFormater
определяем подходит ли нам предложение. Если подходит добавляем его в
новый файл
*/

public class Runner {
    public static void main(String[] args) throws IOException {
        File initialFile = new File("src\\lesson_12\\additonalTask\\task_2", "initialFile.txt");
        writeSentencesToFile(getSuitableSentences(initialFile));
    }

    private static ArrayList<String> getSuitableSentences(File file) throws IOException {
        BufferedReader br = null;
        String allTextFromFile = "";
        try {
            br = new BufferedReader(new FileReader(file));
            String line = br.readLine();
            while (line != null) {
                allTextFromFile += line;
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
        ArrayList<String> listOfSentences = new ArrayList<>();
        for (String s : allTextFromFile.split("(\\.+)|(\\!+)|(\\?+)")) {
            if (TextFormater.isPalindromeInString(s)) {
                listOfSentences.add(s);
            } else {
                int numberOfWords = TextFormater.getNumberOfWordsInText(s);
                if (numberOfWords >= 2 && numberOfWords <= 5) {
                    listOfSentences.add(s);
                }
            }
        }
        return listOfSentences;
    }

    private static void writeSentencesToFile(ArrayList<String> listOfSentences) throws IOException {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(new File("src\\lesson_12\\additonalTask\\task_2", "filteredSentences.txt")));
            for (String s : listOfSentences) {
                bw.write(s + "\n");
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