package lesson_12.task_34;

/*Имеется файл с текстом, в котором присутствуют числа. Найти все числа,
распечатать, посчитать сумму, убрать все повторяющиеся числа и снова
распечатать.*/

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Runner {
    public static void main(String[] args) throws IOException {
        File task34 = new File("task34.txt");
        String stringToWrite = "String1, String2, String3, String4,\n" + " String4";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(task34));) {
            bw.write(stringToWrite);
        } catch (IOException ex) {
            System.out.print(ex.getMessage());
        }
        try (BufferedReader br = new BufferedReader(new FileReader(task34))) {
            String textInDocument = "";
            String lineInDocument;
            while ((lineInDocument = br.readLine()) != null) {
                textInDocument += lineInDocument;
            }
            ArrayList<Integer> listOfNumbers = getListOfNumbersInText(textInDocument);
            System.out.println("Numbers in the text: " + listOfNumbers);
            System.out.println("Sum of numbers: " + getSumOfNumbersInList(listOfNumbers));
            System.out.println("Unique numbers: " + getListOfUniqueNumbers(listOfNumbers));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static ArrayList<Integer> getListOfNumbersInText(String text) {
        String stringOutOfPuncts = text.trim().replaceAll("\\p{Punct}+", " ");
        Pattern pat = Pattern.compile("[-]?[0-9]+(.[0-9]+)?");
        Matcher matcher = pat.matcher(stringOutOfPuncts);
        ArrayList<Integer> listOfNumbers = new ArrayList<>();
        while (matcher.find()) {
            try {
                listOfNumbers.add(Integer.parseInt(matcher.group()));
            } catch (Exception e) {
                System.out.print(e.getMessage());
            }
        }
        return listOfNumbers;
    }

    private static int getSumOfNumbersInList(ArrayList<Integer> list) {
        int sumOfNumbers = 0;
        for (int i : list) {
            sumOfNumbers += i;
        }
        return sumOfNumbers;
    }

    private static HashSet getListOfUniqueNumbers(ArrayList<Integer> list) {
        HashSet set = new HashSet(list);
        return set;
    }
}
