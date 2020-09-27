package lesson_7.interfaces.task_2.jaket;

public class BershkaJaket implements IJaket {
    private double price;
    private boolean isJaketPutOn;

    public BershkaJaket(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void putOn() {
        if (!isJaketPutOn) {
            isJaketPutOn = true;
            System.out.println("Жакет от Bershka надет!");
        } else {
            System.out.println("Жакет от Bershka уже надет!");
        }
    }

    @Override
    public void takeOff() {
        if (isJaketPutOn) {
            isJaketPutOn = false;
            System.out.println("Жакет от Bershka снят!");
        } else {
            System.out.println("Жакет от Bershka уже снят!");
        }
    }
}
