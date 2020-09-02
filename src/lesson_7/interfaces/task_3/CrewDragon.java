package lesson_7.interfaces.task_3;

public class CrewDragon implements IStart {
    boolean isElonMuskApproved;

    public CrewDragon(boolean isElonMuskApproved) {
        this.isElonMuskApproved = isElonMuskApproved;
    }

    @Override
    public boolean pre_startCheck() {
        if (isElonMuskApproved) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатели CrewDragon готовы к запуску!");
    }

    @Override
    public void start() {
        System.out.println("CrewDragon стартует!");
    }
}
