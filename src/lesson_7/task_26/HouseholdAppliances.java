package lesson_7.task_26;

/*Создать иерархию классов, описывающих бытовую технику. Создать несколько
объектов описанных классов, часть из них включить в розетку.
Иерархия должна иметь хотя бы три уровня.*/

public abstract class HouseholdAppliances {
    String maker;
    double price;
    double garantee;
    boolean isPluggedIn = false;

    public HouseholdAppliances(String maker, double price, double garantee, boolean isPluggedIn) {
        this.maker = maker;
        this.price = price;
        this.garantee = garantee;
        this.isPluggedIn = isPluggedIn;
    }

    public void plugIn() {
        if (!isPluggedIn) {
            isPluggedIn = true;
            System.out.println("Устройство включено в розетку.");
        } else {
            System.out.println("Устройство уже включено в розетку.");
        }
    }

    public void plugOut() {
        if (isPluggedIn) {
            isPluggedIn = false;
            System.out.println("Устройство отключено от питанния.");
        } else {
            System.out.println("Устройство уже отключено от питания.");
        }
    }
}