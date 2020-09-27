package lesson_7.task_27;

public class CreditCard extends BankCard {
    double maxCreditSum;
    double interestRate;
    int maxCreditTerm;

    public CreditCard(String cvc, String number, String ownerFirstName, String ownerLastName, paymentSystems paymentSystem,
                      boolean isContactLessPaymentsAllowed, double maxCreditSum, double interestRate, int maxCreditTerm) throws Exception {
        super(cvc, number, ownerFirstName, ownerLastName, paymentSystem, isContactLessPaymentsAllowed);
        this.maxCreditSum = maxCreditSum;
        this.interestRate = interestRate;
        this.maxCreditTerm = maxCreditTerm;
    }
}
