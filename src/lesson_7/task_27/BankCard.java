package lesson_7.task_27;

/*Создать иерархию классов, описывающих банковские карточки.
Иерархия должна иметь хотя бы три уровня.
*/

public abstract class BankCard {
    String cvc;
    String number;
    String ownerFirstName;
    String ownerLastName;
    paymentSystems cardPaymentSystem;

    enum paymentSystems {
        MasterCard,
        Visa
    }

    boolean isContactLessPaymentsAllowed;

    public BankCard(String cvc, String number, String ownerFirstName, String ownerLastName, paymentSystems paymentSystem,
                    boolean isContactLessPaymentsAllowed) throws Exception {
        setCvc(cvc);
        setNumber(number);
        this.ownerFirstName = ownerFirstName;
        this.ownerLastName = ownerLastName;
        cardPaymentSystem = paymentSystem;
        this.isContactLessPaymentsAllowed = isContactLessPaymentsAllowed;
    }

    public void setCvc(String cvc) throws Exception {
        if (cvc.matches("[0-9]{3}")) {
            this.cvc = cvc;
        } else {
            throw new Exception("CVC isn't valid");
        }
    }

    public void setNumber(String number) throws Exception {
        if (number.matches("[0-9]{12}")) {
            this.number = number;
        } else {
            throw new Exception("Number isn't valid");
        }
    }

    public void showCardInformation(String cardName) {
        System.out.println("Card Name: " + cardName + ", Card Owner: " + this.ownerFirstName + " " + this.ownerLastName + ", Card Number: " + this.number);
    }
}
