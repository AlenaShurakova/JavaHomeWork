package lesson_7.interfaces.task_2;

import lesson_7.interfaces.task_2.jaket.BershkaJaket;
import lesson_7.interfaces.task_2.pants.MangoPants;
import lesson_7.interfaces.task_2.shoes.ZaraShoes;

public class Run {
    public static void main(String[] args) {
        Man alena = new Man(new BershkaJaket(60.5), new MangoPants(100.5), new ZaraShoes(150.5));
        System.out.println("Цена лука Алены: " + alena.priceOfLook() + "р.");
        System.out.println("Одеться!");
        alena.putOn();
        System.out.println("Раздеться!");
        alena.takeOff();
    }
}
