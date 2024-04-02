package week04.interfaceexamples.intrerface_example;

public class PayPalPayment implements PaymentMethod {
    private String email;

    public PayPalPayment(String email){
        this.email= email;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Paypal payment processsed for amount:" + amount);
    }
}
