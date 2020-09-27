package lesson_7.abstract_Classes;

/*
В классе Грузовой добавляется  поле:
- Грузоподъёмность(т)
*/

public class FreightTransport extends LandTransport {
    double liftingCapacity;

    public FreightTransport(double capacity, double maxSpeed, double weight, String brand, int numberOfWheels, double fuelConsumption,
                            double liftingCapacity) {
        super(capacity, maxSpeed, weight, brand, numberOfWheels, fuelConsumption);
        this.liftingCapacity = liftingCapacity;
    }

    @Override
    public void ShowDescription() {
        super.ShowDescription();
        System.out.println("Грузоподъемность (т): " + liftingCapacity);
    }

    public void CheckIfCargoCanBePlaced(double weightOfCargo) {
        if (weightOfCargo <= liftingCapacity) {
            System.out.println("Грузовик загружен");
        } else {
            System.out.println("Вам нужен грузовик побольше");
        }
    }
}
