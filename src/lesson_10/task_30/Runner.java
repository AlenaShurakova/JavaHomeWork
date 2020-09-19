package lesson_10.task_30;

/*
Создать коллекцию, наполнить ее случайными числами. Удалить повторяющиеся
числа.
* */

import java.util.*;

public class Runner {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add((int) (Math.random() * 10));
        }
        System.out.println("Числа в коллекции до удаления повторяющихся: " + numbers);
        Set<Integer> uniqueNumbers = new HashSet<>(numbers);
        List<Integer> filteredNumbers = new ArrayList<>(uniqueNumbers);
        System.out.println("Числа в коллекции после удаления повторяющихся: " + filteredNumbers);
    }
}