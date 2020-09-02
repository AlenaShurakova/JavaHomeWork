package lesson_7.task_27;

public class Debit_Card extends Bank_Card {
    public Debit_Card(String cvc, String number, String ownerFirstName, String ownerLastName, paymentSystems paymentSystem,
                      boolean isContactLessPaymentsAllowed) throws Exception {
        super(cvc, number, ownerFirstName, ownerLastName, paymentSystem, isContactLessPaymentsAllowed);
    }
}