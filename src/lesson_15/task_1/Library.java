package lesson_15.task_1;

import java.util.ArrayList;

public class Library {
    public ArrayList<Book> books;

    public Library() {
        books = getBooksList();
    }

    private ArrayList<Book> getBooksList() {
        return XMLReader.parseXMLFile();
    }
}
