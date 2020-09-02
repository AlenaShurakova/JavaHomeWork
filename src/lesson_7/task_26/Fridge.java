package lesson_7.task_26;

public class Fridge extends Refrigiration_Equipment {
    boolean isNoFrostIncluded;
    boolean isEggsTrayIncluded;

    public Fridge(String maker, double price, double garantee, boolean isPluggedIn, int numberOfBoxesInFreezer,
                  double benificalVolume, String energyClass, boolean isEggsTrayIncluded, boolean isNoFrostIncluded) {
        super(maker, price, garantee, isPluggedIn, numberOfBoxesInFreezer, benificalVolume, energyClass);
        this.isEggsTrayIncluded = isEggsTrayIncluded;
        this.isNoFrostIncluded = isNoFrostIncluded;
    }
}