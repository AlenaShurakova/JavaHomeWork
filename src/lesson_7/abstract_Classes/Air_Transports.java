package lesson_7.abstract_Classes;

/*
В классе Воздушный добавляются поля:
 - Размах крыльев (м)
 - Минимальная длина взлётно-посадочной полосы для взлёта
*/
public abstract class Air_Transports extends Transport {
    double wingspan;
    int minRunway;

    public Air_Transports(double capacity, double maxSpeed, double weight, String brand, double wingspan, int minRunway) {
        super(capacity, maxSpeed, weight, brand);
        this.wingspan = wingspan;
        this.minRunway = minRunway;
    }

    @Override
    public void ShowDescription() {
        super.ShowDescription();
        System.out.println("Размах крыльев (м): " + wingspan + "\n" + "Минимальная длина взлетно посадочной полосы: " + minRunway);
    }
}
