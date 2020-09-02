package lesson_7.task_26;

public class Iron extends Ironing_Equipment {
    //материал подошвы
    String outsoleMaterial;

    public Iron(String maker, double price, double garantee, boolean isPluggedIn, int capacity, int powerFlowSpeed,
                int waterReservsVolume, String outsoleMaterial) {
        super(maker, price, garantee, isPluggedIn, capacity, powerFlowSpeed, waterReservsVolume);
        this.outsoleMaterial = outsoleMaterial;
    }
}