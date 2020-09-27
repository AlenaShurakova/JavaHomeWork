package lesson_7.task_26;

public class Steamer extends IroningEquipment {
    boolean manual;
    //готовность пара (сек)
    int steamReadiness;

    public Steamer(String maker, double price, double garantee, boolean isPluggedIn, int capacity, int powerFlowSpeed,
                   int waterReservsVolume, boolean manual, int steamReadiness) {
        super(maker, price, garantee, isPluggedIn, capacity, powerFlowSpeed, waterReservsVolume);
        this.manual = manual;
        this.steamReadiness = steamReadiness;
    }
}