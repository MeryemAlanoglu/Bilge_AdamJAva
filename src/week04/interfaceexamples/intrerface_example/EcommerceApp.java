package week04.interfaceexamples.intrerface_example;

public class EcommerceApp {
    public static void main(String[] args) {
        PaymentMethod creditPayment=new CreditCardPayment("126946546","6666","77");
        PaymentMethod payPayethod=new PayPalPayment("mail@gmail.com");

        double totalPrice =100.50;
        creditPayment.processPayment(totalPrice);
        payPayethod.processPayment(totalPrice);
        }
    }

