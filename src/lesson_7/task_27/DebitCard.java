package lesson_7.task_27;

public class DebitCard extends BankCard {
    public DebitCard(String cvc, String number, String ownerFirstName, String ownerLastName, paymentSystems paymentSystem,
                     boolean isContactLessPaymentsAllowed) throws Exception {
        super(cvc, number, ownerFirstName, ownerLastName, paymentSystem, isContactLessPaymentsAllowed);
    }
}