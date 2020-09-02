package lesson_7.task_26;

public abstract class Refrigiration_Equipment extends Household_Appliances {
    int numberOfBoxesInFreezer;
    //полезный объем (м3)
    double benificalVolume;
    String energyClass;

    public Refrigiration_Equipment(String maker, double price, double garantee, boolean isPluggedIn,
                                   int numberOfBoxesInFreezer, double benificalVolume, String energyClass) {
        super(maker, price, garantee, isPluggedIn);
        this.numberOfBoxesInFreezer = numberOfBoxesInFreezer;
        this.benificalVolume = benificalVolume;
        this.energyClass = energyClass;
    }
}