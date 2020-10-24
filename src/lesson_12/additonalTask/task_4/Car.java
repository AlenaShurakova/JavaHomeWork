package lesson_12.additonalTask.task_4;

import java.io.Serializable;

public class Car implements Serializable {
    String brand;
    double maxSpeed;
    double price;

    public Car(String brand, double maxSpeed, double price) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Бренд: " + brand + ", Максимальная скорость: " + maxSpeed + ", Стоимость: " + price;
    }
}