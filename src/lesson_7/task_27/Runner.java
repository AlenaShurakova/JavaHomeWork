package lesson_7.task_27;

public class Runner {
    public static void main(String[] args) throws Exception {
        Credit_Card credit_card = new Credit_Card("111", "000000000000", "Alena", "Shurakova",
                Bank_Card.paymentSystems.Visa, true, 1000, 10.5, 18);
        Debit_Card debit_card = new Debit_Card("222", "111111111111", "Ivan", "Ivanov",
                Bank_Card.paymentSystems.Visa, true);
        Сumulative_Card сumulative_card = new Сumulative_Card("333", "222222222222", "Petr", "Petrov",
                Bank_Card.paymentSystems.MasterCard, true, 10.5);
        credit_card.showCardInformation("Credit Card");
        debit_card.showCardInformation("Debit Card");
        сumulative_card.showCardInformation("Cumulative Card");
    }
}
