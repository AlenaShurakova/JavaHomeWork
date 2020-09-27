package lesson_7.interfaces.task_2.jaket;

public class MangoJaket implements IJaket {
    private double price;
    private boolean isJaketPutOn;

    public MangoJaket(double price) {
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
            System.out.println("Жакет от Mango надет!");
        } else {
            System.out.println("Жакет от Mango уже надет!");
        }
    }

    @Override
    public void takeOff() {
        if (isJaketPutOn) {
            isJaketPutOn = false;
            System.out.println("Жакет от Mango снят!");
        } else {
            System.out.println("Жакет от Mango уже снят!");
        }
    }
}
