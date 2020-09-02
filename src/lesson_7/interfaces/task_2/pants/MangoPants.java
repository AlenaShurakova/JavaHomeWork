package lesson_7.interfaces.task_2.pants;

public class MangoPants implements IPants {
    private double price;
    private boolean isPantsPutOn;

    public MangoPants(double price) {
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
            System.out.println("Штаны от Mango надеты!");
        } else {
            System.out.println("Штаны от Mango уже надеты!");
        }
    }

    @Override
    public void takeOff() {
        if (isPantsPutOn) {
            isPantsPutOn = false;
            System.out.println("Штаны от Mango сняты!");
        } else {
            System.out.println("Штаны от Mango уже сняты!");
        }
    }
}
