package lesson_7.abstract_Classes;

/*
В классе Транспорт есть поля:
- Мощность(в лошадиных силах)
- Максимальная скорость(км/ч)
- Масса (кг)
- Марка( например: Audi, BMW , Boing,  Airbus,  Scania , МАЗ и т.д. )
*/

public abstract class Transport {
    //Мощность (л.с.)
    double capacity;
    double maxSpeed;
    double weight;
    String brand;

    public Transport(double capacity, double maxSpeed, double weight, String brand) {
        this.capacity = capacity;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.brand = brand;
    }

    public void ShowDescription() {
        System.out.println("Описание:" + "\n" + "Мощность (л.с.): " + capacity + "\n" + "Мощность (кВ): " + powerInKw() +
                "\n" + "Максимальная скорость(км/ч): " + maxSpeed + "\n" + "Масса (кг): " + weight + "\n" + "Марка: " + brand);
    }

    public double powerInKw() {
        return capacity * 0.74;
    }
}