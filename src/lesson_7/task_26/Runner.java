package lesson_7.task_26;

public class Runner {
    public static void main(String[] args) {
        Fridge atlant = new Fridge("Atlant", 1500, 5.5, false, 4,
                3000, "A++", true, true);
        atlant.plugIn();

        Iron phillips = new Iron("Phillips", 289.50, 1, true, 1600, 40,
                550, "ceramics");
        phillips.plugOut();

        Steamer polaris = new Steamer("Polaris", 300, 2, false, 1500,
                26, 340, true, 35);
        polaris.plugOut();
    }
}
