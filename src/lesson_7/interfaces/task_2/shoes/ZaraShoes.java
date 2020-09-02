package lesson_7.interfaces.task_2.shoes;

public class ZaraShoes implements IShoes{
    private double price;
    private boolean isPantsPutOn;

    public ZaraShoes(double price) {
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
            System.out.println("Обувь от Zara надета!");
        } else {
            System.out.println("Обувь от Zara уже надета!");
        }
    }

    @Override
    public void takeOff() {
        if (isPantsPutOn) {
            isPantsPutOn = false;
            System.out.println("Обувь от Zara  снята!");
        } else {
            System.out.println("Обувь от Zara уже снята!");
        }
    }
}
