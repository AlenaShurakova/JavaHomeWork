package lesson_10.task_31;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
Создать список оценок учеников с помощью ArryList, заполнить случайными
оценками. Найти самую высокую оценку с использованием итератора.
* */

public class Runner {
    public static void main(String[] args) {
        List<Integer> marks = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            marks.add((int) (Math.random() * 10));
        }
        Integer maxValue = 0;
        Iterator<Integer> iterator = marks.iterator();
        while (iterator.hasNext()) {
            Integer nextValue = iterator.next();
            if (nextValue > maxValue) {
                maxValue = nextValue;
            }
        }
        System.out.println("Коллекция состоит из следующих оценок: " + marks);
        System.out.println("Максимальная оценка: " + maxValue);
    }
}
