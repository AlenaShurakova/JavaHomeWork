package lesson_7.interfaces.task_3;

public class Spaceport {
    public void start(IStart start) {
        if (!start.pre_startCheck()) {
            System.out.println("Предстартовая проверка провалена.");
        } else {
            start.startEngine();
            count(10);
            start.start();
        }

    }

    private static void count(int seconds) {
        for (int i = seconds; i > 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Interrupted exception is thrown");
            }
        }
    }
}
