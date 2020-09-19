package lesson_7.task_26;

public abstract class IroningEquipment extends HouseholdAppliances {
    //мощность (Вт)
    int capacity;
    //скорость подачи пара (г/мин)
    int powerFlowSpeed;
    //объем резервуара для воды (мл)
    int waterReservsVolume;

    public IroningEquipment(String maker, double price, double garantee, boolean isPluggedIn, int capacity, int powerFlowSpeed, int waterReservsVolume) {
        super(maker, price, garantee, isPluggedIn);
        this.capacity = capacity;
        this.powerFlowSpeed = powerFlowSpeed;
        this.waterReservsVolume = waterReservsVolume;
    }
}