package Lesson_3;/*
Создать двухмерный квадратный массив, и заполнить его «бабочкой», т.е
таким образом:
1 1 1 1 1
0 1 1 1 0
0 0 1 0 0
0 1 1 1 0
1 1 1 1 1
* */

public class Task_17_M {
    public static void main(String[] args) {
        int[][] massive = new int[5][5];
        for (int i = 0; i < massive.length; i++) {
            for (int j = i; j < massive.length - i; j++) {
                massive[i][j] = 1;
                massive[massive.length - 1 - i][j] = 1;
            }
        }
        for (int i = 0; i < massive.length; i++) {
            for (int j = 0; j < massive.length; j++) {
                System.out.print(massive[i][j] + " ");
            }
            System.out.println();
        }
    }
}