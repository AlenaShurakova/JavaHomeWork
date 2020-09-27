package lesson_12.task_36;

/*
Вывести список файлов и каталогов выбранного каталога на диске. Файлы и каталоги
должны быть распечатаны отдельно.
* */

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        File dir = new File("C:/Users");
        File[] allData = dir.listFiles();
        List<File> directories = new ArrayList<>();
        List<File> files = new ArrayList<>();
        for (File file : allData) {
            if (file.isDirectory()) {
                directories.add(file);
            } else {
                files.add(file);
            }
        }
        System.out.println("Список директорий: ");
        for (File file : directories) {
            System.out.println(file.getName());
        }
        System.out.println("Список файлов в директории:");
        for (File file : files) {
            System.out.println(file.getName());
        }
    }
}
