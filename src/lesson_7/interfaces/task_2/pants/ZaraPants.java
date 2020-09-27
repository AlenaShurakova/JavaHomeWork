package lesson_7.interfaces.task_2.pants;

public class ZaraPants implements IPants {
    private double price;
    private boolean isPantsPutOn;

    public ZaraPants(double price) {
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
            System.out.println("Штаны от Zara надеты!");
        } else {
            System.out.println("Штаны от Zara уже надеты!");
        }
    }

    @Override
    public void takeOff() {
        if (isPantsPutOn) {
            isPantsPutOn = false;
            System.out.println("Штаны от Zara сняты!");
        } else {
            System.out.println("Штаны от Zara уже сняты!");
        }
    }
}
