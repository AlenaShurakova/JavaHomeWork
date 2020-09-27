package lesson_7.interfaces.task_2.jaket;

public class ZaraJaket implements IJaket {
    private double price;
    private boolean isJaketPutOn;

    public ZaraJaket(double price) {
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
            System.out.println("Жакет от Zara надет!");
        } else {
            System.out.println("Жакет от Zara уже надет!");
        }
    }

    @Override
    public void takeOff() {
        if (isJaketPutOn) {
            isJaketPutOn = false;
            System.out.println("Жакет от Zara снят!");
        } else {
            System.out.println("Жакет от Zara уже снят!");
        }
    }
}
