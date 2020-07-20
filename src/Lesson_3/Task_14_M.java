package Lesson_3;

/*
* Создать массив оценок произвольной длины, вывести максимальную и
минимальную оценку, её (их) номера.
* */
public class Task_14_M {
    public static void main(String[] args) {
        int sizeOfMassive = (int) (Math.random() * 10);
        int[] massive = new int[sizeOfMassive];
        for (int i = 0; i < massive.length; i++) {
            massive[i] = (int) (Math.random() * 100);
        }
        int maxIndex = 0;
        int minIndex = 0;
        int maxNumber = 0;
        int minNumber = 99;
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] >= maxNumber) {
                maxNumber = massive[i];
                maxIndex = i;
            }
            if (massive[i] <= minNumber) {
                minNumber = massive[i];
                minIndex = i;
            }
        }
        System.out.println("Массив состоит из следующий оценок: ");
        for (int i = 0; i < massive.length; i++) {
            System.out.print(massive[i] + " ");
        }
        System.out.println("\nМаксимальная оценка: " + maxNumber + ", ее номер (индекс):" + maxIndex);
        System.out.println("Минимальная оценка: " + minNumber + ", ее номер (индекс):" + minIndex);
    }
}
