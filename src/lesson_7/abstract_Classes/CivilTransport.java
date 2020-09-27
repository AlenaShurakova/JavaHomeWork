package lesson_7.abstract_Classes;

/*В классе Гражданский добавляются поля:
 - Кол-во пассажиров
 - Наличие бизнес класса (true/false)
*/

public class CivilTransport extends AirTransports {
    int passengersCapacity;
    boolean isBussinessClassIncluded;

    public CivilTransport(double capacity, double maxSpeed, double weight, String brand, double wingspan, int minRunway, int passengersCapacity,
                          boolean isBussinessClassIncluded) {
        super(capacity, maxSpeed, weight, brand, wingspan, minRunway);
        this.passengersCapacity = passengersCapacity;
        this.isBussinessClassIncluded = isBussinessClassIncluded;
    }

    @Override
    public void ShowDescription() {
        super.ShowDescription();
        System.out.println("Количество пассажиров: " + passengersCapacity + "\n" + "Наличие бизнес класса: " + isBussinessClassIncluded);
    }

    public void CheckIfPassengersCanBePlaced(int passengersToBePlaced) {
        if (passengersToBePlaced <= passengersCapacity) {
            System.out.println("Все пассажиры размещены");
        } else {
            System.out.println("Вам нужен самолет побольше");
        }
    }
}
