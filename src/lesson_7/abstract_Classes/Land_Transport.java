package lesson_7.abstract_Classes;

/*В классе Наземный добавляются поля:
 - Количество колёс
 - Расход топлива(л/100км)
*/

public abstract class Land_Transport extends Transport {
    int numberOfWheels;
    double fuelConsumption;

    public Land_Transport(double capacity, double maxSpeed, double weight, String brand, int numberOfWheels, double fuelConsumption) {
        super(capacity, maxSpeed, weight, brand);
        this.numberOfWheels = numberOfWheels;
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public void ShowDescription() {
        super.ShowDescription();
        System.out.println("Количество колес: " + numberOfWheels + "\n" + "Расход топлива: (л/100км): " + fuelConsumption);
    }
}
