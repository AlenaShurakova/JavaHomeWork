package lesson_7.task_26;

public abstract class Ironing_Equipment extends Household_Appliances {
    //мощность (Вт)
    int capacity;
    //скорость подачи пара (г/мин)
    int powerFlowSpeed;
    //объем резервуара для воды (мл)
    int waterReservsVolume;

    public Ironing_Equipment(String maker, double price, double garantee, boolean isPluggedIn, int capacity, int powerFlowSpeed, int waterReservsVolume) {
        super(maker, price, garantee, isPluggedIn);
        this.capacity = capacity;
        this.powerFlowSpeed = powerFlowSpeed;
        this.waterReservsVolume = waterReservsVolume;
    }
}