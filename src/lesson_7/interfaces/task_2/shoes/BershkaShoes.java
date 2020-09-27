package lesson_7.interfaces.task_2.shoes;

public class BershkaShoes implements IShoes {
    private double price;
    private boolean isShoesPutOn;

    public BershkaShoes(double price) {
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
            System.out.println("Обувь от Bershka надета!");
        } else {
            System.out.println("Обувь от Bershka уже надета!");
        }
    }

    @Override
    public void takeOff() {
        if (isShoesPutOn) {
            isShoesPutOn = false;
            System.out.println("Обувь от Bershka снята!");
        } else {
            System.out.println("Обувь от Bershka уже снята!");
        }
    }
}
