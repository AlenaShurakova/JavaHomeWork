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
        int n = marksList.size();
        for(Integer i=0; i<n; i++){
            if (i>=0 && i<=3) {
                marksList.remove(i);
                n--;
            }
        }
        System.out.println("Cписок удовлетворительных оценок: " + marksList);
    }
}
