package lesson_7.interfaces.task_3;

public class Run {
    public static void main(String[] args) {
        Spaceport port = new Spaceport();
        Shuttle shuttle = new Shuttle();
        CrewDragon crewDragon = new CrewDragon(true);
        port.start(shuttle);
        port.start(crewDragon);
    }
}
