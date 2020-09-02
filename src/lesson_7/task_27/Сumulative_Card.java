package lesson_7.task_27;

public class Сumulative_Card extends Debit_Card {
    double annualRate;

    public Сumulative_Card(String cvc, String number, String ownerFirstName, String ownerLastName, paymentSystems paymentSystem,
                           boolean isContactLessPaymentsAllowed, double annualRate) throws Exception {
        super(cvc, number, ownerFirstName, ownerLastName, paymentSystem, isContactLessPaymentsAllowed);
        this.annualRate = annualRate;
    }
}