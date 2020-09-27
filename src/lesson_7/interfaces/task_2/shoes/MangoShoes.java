package lesson_7.interfaces.task_2.shoes;

public class MangoShoes implements IShoes {
    private double price;
    private boolean isShoesPutOn;

    public MangoShoes(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void putOn() {
        if (!isShoesPutOn) {
            isShoesPutOn = true;
            System.out.println("Обувь от Mango надета!");
        } else {
            System.out.println("Обувь от Mango уже надета!");
        }
    }

    @Override
    public void takeOff() {
        if (isShoesPutOn) {
            isShoesPutOn = false;
            System.out.println("Обувь от Mango снята!");
        } else {
            System.out.println("Обувь от Mango уже снята!");
        }
    }
}