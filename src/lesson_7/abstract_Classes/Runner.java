package lesson_7.abstract_Classes;

public class Runner {
    public static void main(String[] args) {
        PassengerTransport audiQ5 = new PassengerTransport(170, 280, 1000, "Audi", 4,
                10, "SUV", 5);
        audiQ5.ShowDescription();
        audiQ5.ShowDistanceAndFuelConsumption(1);
        System.out.println();

        FreightTransport mercedesActros = new FreightTransport(985.5, 220, 3000, "Mercedes",
                4, 21.5, 10.5);
        mercedesActros.ShowDescription();
        mercedesActros.CheckIfCargoCanBePlaced(10.5);
        System.out.println();

        CivilTransport boeing737 = new CivilTransport(10000, 750, 41140, "Boeing", 34.3,
                550, 189, true);
        boeing737.ShowDescription();
        boeing737.CheckIfPassengersCanBePlaced(200);
        System.out.println();

        MilitaryTransport airbusA400M = new MilitaryTransport(18750, 900, 76500, "Airbus",
                42.4, 980, true, 1);
        airbusA400M.ShowDescription();
        airbusA400M.Shot();
        airbusA400M.Shot();
        airbusA400M.Bailout();
    }
}
