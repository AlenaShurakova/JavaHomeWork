package lesson_12.task_35;

/*Записать в двоичный файл 20 случайных чисел. Прочитать записанный файл,
распечатать числа и их среднее арифметическое.*/

import java.io.*;
import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) throws IOException {
        File task35 = new File("task35.bin");
        try (DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(task35)))) {
            for (int i = 0; i < 20; i++) {
                dos.writeInt((int) (Math.random() * 10));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        ArrayList<Integer> numbersFromFile = new ArrayList<>();
        try (DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream(task35)));) {
            while (numbersFromFile.size() < 20) {
                numbersFromFile.add(dis.readInt());
            }
            System.out.println("Числа в файле: " + numbersFromFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Среднее арифметическое чисел: " + getAverageArithmetical(numbersFromFile));
    }

    private static double getAverageArithmetical(ArrayList<Integer> arrayList) {
        int sum = 0;
        for (int i : arrayList) {
            sum += i;
        }
        return (double) sum / arrayList.size();
    }
}