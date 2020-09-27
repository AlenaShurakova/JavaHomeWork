package lesson_10.library;

import java.util.*;

public class Library {
    boolean isOpened;
    ArrayList<Book> books = new ArrayList<>();
    Comparator<Book> comparatorByTitleAsc = Comparator.comparing(Book::getTitle);
    Comparator<Book> comparatorByTitleDesc = (o1, o2) -> o2.getTitle().compareTo(o1.getTitle());

    public void addBook(int id, String title, String genre) {
        if (books.size() != 0) {
            for (Book book : books) {
                if (book.getId() == id) {
                    System.out.println("Книга c таким id уже существует");
                    return;
                }
            }
            books.add(new Book(id, title, genre));
            System.out.println("Книга добавлена");
        } else {
            books.add(new Book(id, title, genre));
            System.out.println("Книга добавлена");
        }
    }

    public List<Book> getBooksList(int sortingOption) {
        if (sortingOption == 1) {
            books.sort(comparatorByTitleAsc);
            return books;
        } else if (sortingOption == 2) {
            books.sort(comparatorByTitleDesc);
            return books;
        } else {
            Collections.reverse(books);
            return books;
        }
    }

    public void deleteBook(Integer id) {
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getId() == id) {
                books.remove(book);
                iterator = books.iterator();
                System.out.println("Книга удалена.");
            }
        }
    }

    public void editBook(int id, String title, String genre) {
        Book updatedBook = new Book(id, title, genre);
        for (Book book : books) {
            if (book.getId() == id) {
                books.set(books.indexOf(book), updatedBook);
                System.out.println("Книга изменена.");
                return;
            }
        }
        System.out.println("Книга с таким id не найдена.");
    }
}