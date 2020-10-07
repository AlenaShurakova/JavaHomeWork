package lesson_15.task_1;

public class BookReading implements Runnable {
    Visitor visitor;
    Book book;

    public BookReading(Book book, Visitor visitor) {
        this.book = book;
        this.visitor = visitor;
    }

    @Override
    public void run() {
        synchronized (book) {
            try {
                System.out.println("Посетитель " + visitor.fullName + " читает книгу " + book.title + " в потоке " + Thread.currentThread().getName());
                Thread.sleep(3000);
                System.out.println("Книга " + book.title + " прочитана");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
