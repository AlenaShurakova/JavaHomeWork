package lesson_10.task_29;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
Создать список оценок учеников с помощью ArrayList, заполнить случайными
оценками. Удалить неудовлетворительные оценки из списка.
* */

public class Runner {
    public static void main(String[] args) {
        List<Integer> marksList = new ArrayList<Integer>();
        for (int i =0; i<10;i++){
            marksList.add((int)(Math.random()*10));
        }
        System.out.println("Список всех оценок:" + marksList);
        Iterator<Integer> iterator = marksList.iterator();
        while (iterator.hasNext()) {
            Integer s = iterator.next();
            if (s.equals(0) || s.equals(1) || s.equals(2) || s.equals(3)) {
                marksList.remove(s);
                iterator = marksList.iterator();
            }
        }
        System.out.println("Cписок удовлетворительных оценок: " + marksList);
    }
}
