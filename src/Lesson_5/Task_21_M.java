package Lesson_5;

/*Напишите три цикла выполняющих многократное сложение строк, один с
помощью оператора сложения и String, другой с помощью StringBuilder и метода
append, а также аналогино для StringBuffer. Сравните скорость их выполнения.*/

import javax.print.DocFlavor;

public class Task_21_M {
    public static void main(String[] args) {
        String[] stringMassive = new String[]{"Hello", ",", "World", "!"};
        String string1 = "";
        StringBuilder string2 = new StringBuilder();
        StringBuffer string3 = new StringBuffer();

        stringCalculation(string1, stringMassive);
        stringCalculation(string2, stringMassive);
        stringCalculation(string3, stringMassive);
    }

    public static void stringCalculation(String string, String[] massive) {
        long startTime = System.nanoTime();
        for (int i = 0; i < massive.length; i++) {
            string += massive[i];
        }
        long endTime = System.nanoTime();
        long completionTime = endTime - startTime;
        System.out.println("Строка:" + string + ", скорость выполнения метода: " + completionTime + " наносекунд");
    }

    public static void stringCalculation(StringBuilder string, String[] massive) {
        long startTime = System.nanoTime();
        for (int i = 0; i < massive.length; i++) {
            string.append(massive[i]);
        }
        long endTime = System.nanoTime();
        long completionTime = endTime - startTime;
        System.out.println("Строка:" + string + ", скорость выполнения метода: " + completionTime + " наносекунд");
    }

    public static void stringCalculation(StringBuffer string, String[] massive) {
        long startTime = System.nanoTime();
        for (int i = 0; i < massive.length; i++) {
            string.append(massive[i]);
        }
        long endTime = System.nanoTime();
        long completionTime = endTime - startTime;
        System.out.println("Строка:" + string + ", скорость выполнения метода: " + completionTime + " наносекунд");
    }
}