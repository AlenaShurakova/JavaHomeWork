package lesson_15.task_1;

import java.util.ArrayList;
import java.util.concurrent.SynchronousQueue;

public class Visitor {
    public String fullName;

    public Visitor(String fullName) {
        this.fullName = fullName;
    }

    public void takeBook(String title, Library library, boolean takeHome) {
        boolean isBookInLibrary = false;
        for (Book book : library.books) {
            if (title.equals(book.title)) {
                isBookInLibrary = true;
                if (takeHome == false) {
                    new Thread(new BookReading(book, this)).start();
                } else if (takeHome == true && book.canBeReadAtHome == true) {
                    new Thread(new BookReading(book, this)).start();
                } else {
                    System.out.println("Книга не может быть взята домой.");
                }
            }
        }
        if (!isBookInLibrary) {
            System.out.println("Такой книги нет в библиотеке");
        }
    }
}