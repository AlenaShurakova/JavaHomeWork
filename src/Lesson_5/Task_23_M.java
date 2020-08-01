package Lesson_5;

/*
Написать программу, выполняющую поиск в строке всех тегов абзацев, в т.ч. тех, у
которых есть параметры, например <p id=”p1”>, и замену их на простые теги
абзацев <p>.
* */
public class Task_23_M {
    public static void main(String[] args) {
        String initialText = "The 1st paragraph is <p id='p1'>, the 2nd paragraph <p id=2/> and the 3rd <p>";
        String formattedText = initialText.replaceAll("<p.+?>", "<p>");
        System.out.println(formattedText);
    }
}