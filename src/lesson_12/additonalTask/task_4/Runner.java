package lesson_12.additonalTask.task_4;
/*
*
4) Сеарилизовать объект Автомобиль(Марка, скорость, цена). После
сериализации произвести обратный процесс
*  */

import java.io.*;

public class Runner {
    public static void main(String[] args) throws IOException {
        File carFile = new File("car.dat");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(carFile))) {
            Car car = new Car("BMW", 280.5, 50000);
            oos.writeObject(car);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(carFile))) {
            Car deserializedCar = (Car) ois.readObject();
            System.out.println(deserializedCar);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
