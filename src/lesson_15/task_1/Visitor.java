package lesson_15.task_1;

public class Visitor implements Runnable {
    public String fullName;
    Book book;
    Library library;

    public Visitor(String fullName) {
        this.fullName = fullName;
    }

    public void takeBook(String title, Library library, boolean takeHome) {
        boolean isBookInLibrary = false;
        this.library = library;
        for (Book book : library.books) {
            if (title.equals(book.title)) {
                isBookInLibrary = true;
                if (takeHome == false) {
                    this.book = book;
                    new Thread(this).start();
                } else if (takeHome == true && book.canBeReadAtHome == true) {
                    this.book = book;
                    new Thread(this).start();
                } else {
                    System.out.println("Книга не может быть взята домой.");
                }
            }
        }
        if (!isBookInLibrary) {
            System.out.println("Такой книги нет в библиотеке");
        }
    }

    @Override
    public void run() {
        synchronized (library.books.get(library.books.indexOf(book))) {
            try {
                System.out.println("Посетитель " + this.fullName + " читает книгу " + book.title + " в потоке " + Thread.currentThread().getName());
                Thread.sleep(3000);
                System.out.println("Книга " + book.title + " прочитана");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}