package lesson_7.task_27;

public class СumulativeCard extends DebitCard {
    double annualRate;

    public СumulativeCard(String cvc, String number, String ownerFirstName, String ownerLastName, paymentSystems paymentSystem,
                          boolean isContactLessPaymentsAllowed, double annualRate) throws Exception {
        super(cvc, number, ownerFirstName, ownerLastName, paymentSystem, isContactLessPaymentsAllowed);
        this.annualRate = annualRate;
    }
}