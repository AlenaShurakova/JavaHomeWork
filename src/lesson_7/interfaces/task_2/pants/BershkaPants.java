package lesson_7.interfaces.task_2.pants;

public class BershkaPants implements IPants {
    private double price;
    private boolean isPantsPutOn;

    public BershkaPants(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void putOn() {
        if (!isPantsPutOn) {
            isPantsPutOn = true;
            System.out.println("Штаны от Bershka надеты!");
        } else {
            System.out.println("Штаны от Bershka уже надеты!");
        }
    }

    @Override
    public void takeOff() {
        if (isPantsPutOn) {
            isPantsPutOn = false;
            System.out.println("Штаны от Bershka сняты!");
        } else {
            System.out.println("Штаны от Bershka уже сняты!");
        }
    }
}
