package lesson_7.task_27;

public class Runner {
    public static void main(String[] args) throws Exception {
        CreditCard creditCard = new CreditCard("111", "000000000000", "Alena", "Shurakova",
                BankCard.paymentSystems.Visa, true, 1000, 10.5, 18);
        DebitCard debitCard = new DebitCard("222", "111111111111", "Ivan", "Ivanov",
                BankCard.paymentSystems.Visa, true);
        СumulativeCard сumulativeCard = new СumulativeCard("333", "222222222222", "Petr", "Petrov",
                BankCard.paymentSystems.MasterCard, true, 10.5);
        creditCard.showCardInformation("Credit Card");
        debitCard.showCardInformation("Debit Card");
        сumulativeCard.showCardInformation("Cumulative Card");
    }
}
