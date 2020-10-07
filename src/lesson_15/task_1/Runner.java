package lesson_15.task_1;

/*
 * 1)Написать клиент для работы библиотеки. В библиотеке доступны к чтению несколько книг.  Некоторые из них
 *  можно выдавать на руки некоторые - только в читальный зал. Посетители могут брать одновременно по несколько книг
 *  на руки и в читальный зал.*/

import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) throws InterruptedException {
        Visitor alena = new Visitor("Алёна Шуракова");
        Visitor ivan = new Visitor("Иван Иванов");
        Library nationalLibrary = new Library();
        alena.takeBook("Вино из одуванчиков", nationalLibrary, false);
        ivan.takeBook("Вино из одуванчиков", nationalLibrary, false);
        alena.takeBook("Атлант расправил плечи", nationalLibrary, true);
    }
}
