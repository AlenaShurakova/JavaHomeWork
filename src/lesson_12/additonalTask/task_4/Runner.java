package lesson_12.additonalTask.task_4;
/*
*
4) Сеарилизовать объект Автомобиль(Марка, скорость, цена). После
сериализации произвести обратный процесс
*  */

import java.io.*;

public class Runner {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = null;
        File carFile = new File("src\\lesson_12\\additonalTask\\task_4", "car.dat");
        try {
            oos = new ObjectOutputStream(new FileOutputStream(carFile));
            Car car = new Car("BMW", 280.5, 50000);
            oos.writeObject(car);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (oos != null) {
                oos.close();
            }
        }
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream(carFile));
            Car deserializedCar = (Car) ois.readObject();
            System.out.println(deserializedCar);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (ois != null) {
                ois.close();
            }
        }
    }
}
