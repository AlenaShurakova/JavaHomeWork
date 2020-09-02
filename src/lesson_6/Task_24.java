package lesson_6;

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
        Timer timer1 = new Timer(3001);
        Timer timer2 = new Timer(0, 0, 1);
        timer1.showData();
        timer2.showData();
        System.out.println("Result of 2 objects comparison: " + timer1.CompareTimers(timer2));
        System.out.println("Total number of seconds for the seconds object:" + timer2.seconds);
    }
}

class Timer {
    int seconds;

    public Timer(int seconds) {
        this.seconds = seconds;
    }

    public Timer(int seconds, int minutes, int hours) {
        this.seconds = seconds + minutes * 60 + hours * 3600;
    }

    public int CompareTimers(Timer timer) {
        if (this.seconds > timer.seconds) {
            return 1;
        } else if (this.seconds == timer.seconds) {
            return 0;
        } else {
            return -1;
        }
    }

    public void showData() {
        System.out.println("Number of Hours:" + seconds/3600+"; Number of minutes:"+ ((seconds%3600)/60)+
                        "; Number of seconds:" + ((seconds%3600)%60));
    }
}