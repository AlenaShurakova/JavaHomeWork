package lesson_15.task_1;

public class Book {
    public String title;
    public String author;
    public String genre;
    public boolean canBeReadAtHome;

    public Book() {
    }

    @Override
    public String toString() {
        return "Название: " + this.title + ", Автор: " + this.author + ", Жанр: " + this.genre + ", Можно взять домой: " + this.canBeReadAtHome;
    }
}
