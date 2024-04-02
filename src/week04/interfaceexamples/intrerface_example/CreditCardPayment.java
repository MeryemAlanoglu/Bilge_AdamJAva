package week04.interfaceexamples.intrerface_example;

public class CreditCardPayment implements PaymentMethod {

    private String cardNumber;
    private String expirydate;
    private String cvc;



    public CreditCardPayment(String cardNumber,String expirtyDate,String cvc) {
        this.cardNumber=cardNumber;
        this.expirydate=expirtyDate;
        this.cvc=cvc;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Credit card payment processed for amonut:" + amount);

    }
}
