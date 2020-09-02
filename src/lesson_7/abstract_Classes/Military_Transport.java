package lesson_7.abstract_Classes;

/*
*
В классе Военный  добавляются поля:
- Наличие системы катапультирования (true/false) - Кол-во ракет на борту
*/

public class Military_Transport extends Air_Transports {
    boolean isBailoutIncluded;
    int numberOfRockets;

    public Military_Transport(double capacity, double maxSpeed, double weight, String brand, double wingspan, int minRunway,
                              boolean isBailoutIncluded, int numberOfRockets) {
        super(capacity, maxSpeed, weight, brand, wingspan, minRunway);
        this.isBailoutIncluded = isBailoutIncluded;
        this.numberOfRockets = numberOfRockets;
    }

    @Override
    public void ShowDescription() {
        super.ShowDescription();
        System.out.println("Наличие системы капитулирования: " + isBailoutIncluded + "\n" + "Количество ракет на борту: " + numberOfRockets);
    }

    public void Shot() {
        if (numberOfRockets > 0) {
            System.out.println("Ракета пошла...");
            numberOfRockets--;
        } else {
            System.out.println("Ракеты отсутствуют");
        }
    }

    public void Bailout() {
        if (isBailoutIncluded) {
            System.out.println("Катапультирование прошло успешно");
        } else {
            System.out.println("У вас нет такой системы");
        }
    }
}