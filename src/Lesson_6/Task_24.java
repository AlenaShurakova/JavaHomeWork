package Lesson_6;

/*
Создать класс и объекты описывающие промежуток времени. Сам промежуток
в классе должен задаваться тремя свойствами: секундами, минутами, часами.
Сделать методы для получения полного количества секунд в объекте, сравнения
двух объектов (метод должен работать аналогично compareTo в строках). Создать
два конструктора: получающий общее количество секунд, и часы, минуты и секунды
по отдельности. Сделать метод для вывода данных.
* */
public class Task_24 {
    public static void main(String[] args) {
        Timer timer1 = new Timer(3600);
        Timer timer2 = new Timer(0, 0, 1);
        timer1.ShowData();
        timer2.ShowData();
        System.out.println("Result of 2 objects comparison: " + timer1.CompareTimers(timer2));
        System.out.println("Total number of seconds for the seconds object:" + timer2.SecondsCounter());
    }
}

class Timer {
    int seconds;
    int minutes;
    int hours;

    public Timer(int seconds) {
        this.seconds = seconds;
    }

    public Timer(int seconds, int minutes, int hours) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }

    public int SecondsCounter() {
        int fullNumberOfSeconds = this.seconds + this.minutes * 60 + this.hours * 3600;
        return fullNumberOfSeconds;
    }

    public int CompareTimers(Timer timer) {
        if (this.SecondsCounter() > timer.SecondsCounter()) {
            return 1;
        } else if (this.SecondsCounter() == timer.SecondsCounter()) {
            return 0;
        } else {
            return -1;
        }
    }

    public void ShowData() {
        System.out.println("Number Of Seconds: " + seconds + ", number of minutes: " + minutes + ", number of Hours: " + hours);
    }
}