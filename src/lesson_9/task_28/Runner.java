package lesson_9.task_28;

/*
Написать класс, который умеет хранить в себе массив любых типов данных (int, long
etc.). Реализовать метод get(int index), который возвращает любой элемент
массива по индексу.
*/

public class Runner {
    public static void main(String[] args) {
        Generics<Integer> integersMassive = new Generics<>();
        integersMassive.massive = new Integer[]{1, 2, 3, 4, 5};
        Generics<String> stringsMassive = new Generics<>();
        stringsMassive.massive = new String[]{"first element", "second element"};
        System.out.println("Element of integersMassive that has \"0\" index: " + integersMassive.massive[0]);
        System.out.println("Element of stringsMassive that has \"0\" index: " + stringsMassive.massive[0]);
    }
}
