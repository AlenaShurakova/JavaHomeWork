package lesson_7.abstract_Classes;

/*
В классе Легковой добавляются поля:
- Тип кузова
- Кол-во пассажиров
*/

public class Passenger_Transport extends Land_Transport {
    String bodyType;
    int numberOfPassenghers;

    public Passenger_Transport(double capacity, double maxSpeed, double weight, String brand, int numberOfWheels, double fuelConsumption,
                               String bodyType, int numberOfPassenghers) {
        super(capacity, maxSpeed, weight, brand, numberOfWheels, fuelConsumption);
        this.bodyType = bodyType;
        this.numberOfPassenghers = numberOfPassenghers;
    }

    @Override
    public void ShowDescription() {
        super.ShowDescription();
        System.out.println("Количество колес: " + numberOfWheels + "\n" + "Расход топлива: (л/100км): " + fuelConsumption + "\n" +
                "Тип кузова: " + bodyType + "\n" + "Количество пассажиров: " + numberOfPassenghers);
    }

    public void ShowDistanceAndFuelConsumption(double hours) {
        double numberOfKm = maxSpeed * hours;
        double fuelWasted = FuelConsumptionCount(hours);
        System.out.println("За время " + hours + "(ч) автомобиль " + brand + " дивагаясь с максимальной скоростью " +
                maxSpeed + " км/ч" + " проедет " + numberOfKm + " км и израсходует " + fuelWasted + " литров топлива");
    }

    private double FuelConsumptionCount(double hours) {
        return maxSpeed * hours * fuelConsumption / 100;
    }
}
