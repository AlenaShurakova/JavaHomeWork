package lesson_7.task_26;

public abstract class RefrigirationEquipment extends HouseholdAppliances {
    int numberOfBoxesInFreezer;
    //полезный объем (м3)
    double benificalVolume;
    String energyClass;

    public RefrigirationEquipment(String maker, double price, double garantee, boolean isPluggedIn,
                                  int numberOfBoxesInFreezer, double benificalVolume, String energyClass) {
        super(maker, price, garantee, isPluggedIn);
        this.numberOfBoxesInFreezer = numberOfBoxesInFreezer;
        this.benificalVolume = benificalVolume;
        this.energyClass = energyClass;
    }
}