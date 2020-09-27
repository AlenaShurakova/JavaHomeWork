package lesson_7.interfaces.task_3;

public class Shuttle implements IStart {

    @Override
    public boolean prestartCheck() {
        if ((int) (Math.random() * 10) > 3) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатели Шатла запущены.");
    }

    @Override
    public void start() {
        System.out.println("Старт Шатла");
    }
}
