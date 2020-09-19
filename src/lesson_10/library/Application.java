package lesson_10.library;

import java.util.List;
import java.util.Scanner;

public class Application {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Library library = new Library();
        library.isOpened = true;
        while (library.isOpened) {
            System.out.println("1. Вывести все книги 2. Добавить книгу 3. Редактировать книгу 4. Удалить книгу 5. Выход из программы");
            int inputtedOption = 0;
            try {
                inputtedOption = scanner.nextInt();
            } catch (Exception e) {
                scanner.nextLine();
            }
            switch (inputtedOption) {
                case 1:
                    System.out.println(showAllBooks(library));
                    break;
                case 2:
                    inputDataForAddingBook(library);
                    break;
                case 3:
                    inputDataForEditingBook(library);
                    break;
                case 4:
                    inputIdForDeletingBook(library);
                    break;
                case 5:
                    library.isOpened = false;
                    scanner.close();
                    System.out.println("Работа библиотеки завершается.");
                    return;
                default:
                    System.out.println("Введен некорректный код операции.");
                    break;
            }
        }
    }

    private static List<Book> showAllBooks(Library library) {
        int inputtedSortingOption = selectSortingOption();
        switch (inputtedSortingOption) {
            case 1, 2, 3:
                return library.getBooksList(inputtedSortingOption);
            default:
                System.out.println("Введен некорректный код операции.");
                return null;
        }
    }

    private static int selectSortingOption() {
        String optionsRegex = "[1-3]";
        boolean isCorrectOptionInputted = false;
        while (!isCorrectOptionInputted) {
            System.out.println("Выберите сортировку:");
            System.out.println("1. По алфавиту (возрастание) 2. По алфавиту (убывание) " +
                    "3. По добавлению (сначала новые, потом более старые)");
            String inputtedOption = scanner.next() + scanner.nextLine();
            if (inputtedOption.matches(optionsRegex)) {
                return Integer.parseInt(inputtedOption);
            }
        }
        return 0;
    }

    private static void inputDataForAddingBook(Library library) {
        library.addBook(inputId(), inputTitle(), inputGenre());
    }

    private static void inputDataForEditingBook(Library library) {
        library.editBook(inputId(), inputTitle(), inputGenre());
    }

    private static void inputIdForDeletingBook(Library library) {
        library.deleteBook(inputId());
    }

    private static int inputId() {
        boolean isCorrectIdInputted = false;
        String regexId = "\\d*";
        while (!isCorrectIdInputted) {
            System.out.println("Введите id (целое число): ");
            String inputtedValue = scanner.next() + scanner.nextLine();
            if (inputtedValue.matches(regexId)) {
                int id = Integer.parseInt(inputtedValue);
                return id;
            } else {
                System.out.println("Введенное значение некорректно. Пожалуйста, введите целое число.");
            }
        }
        return 0;
    }

    private static String inputTitle() {
        boolean isCorrectTitleInputted = false;
        while (!isCorrectTitleInputted) {
            System.out.println("Введите название книги: ");
            String title = scanner.nextLine();
            if (title.trim().length() > 0) {
                return title;
            } else {
                System.out.println("Название книги не может быть пустым или состоять только из пробелов.");
            }
        }
        return null;
    }

    private static String inputGenre() {
        boolean isCorrectGenreInputted = false;
        while (!isCorrectGenreInputted) {
            System.out.println("Введите жанр книги: ");
            String genre = scanner.nextLine();
            if (genre.trim().length() > 0) {
                return genre;
            } else {
                System.out.println("Название книги не может быть пустым или состоять только из пробелов.");
            }
        }
        return null;
    }
}