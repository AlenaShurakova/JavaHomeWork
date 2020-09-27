package lesson_7.interfaces.task_2;

import lesson_7.interfaces.task_2.jaket.IJaket;
import lesson_7.interfaces.task_2.pants.IPants;
import lesson_7.interfaces.task_2.shoes.IShoes;

public class Man {
    private IJaket jaket;
    private IPants pants;
    private IShoes shoes;

    public Man(IJaket jaket, IPants pants, IShoes shoes) {
        this.jaket = jaket;
        this.pants = pants;
        this.shoes = shoes;
    }

    public Man() {
    }

    public void putOn() {
        jaket.putOn();
        pants.putOn();
        shoes.putOn();
    }

    public void takeOff() {
        jaket.takeOff();
        pants.takeOff();
        shoes.takeOff();
    }

    public double priceOfLook() {
        return jaket.getPrice() + pants.getPrice() + shoes.getPrice();
    }
}
