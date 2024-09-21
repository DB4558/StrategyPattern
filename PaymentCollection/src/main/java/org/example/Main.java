package org.example;

public class Main {
    public static void main(String[] args) {
        DisplayStrategy displayStrategy=new UPIDisplay();
        PaymentCollectionStrategy paymentCollectionStrategy=new UPIPaymentCollection();
        Payment payment1=new Payment(displayStrategy,paymentCollectionStrategy);
        payment1.paymentCollection();

        DisplayStrategy displayStrategy1=new CardDisplay();
        PaymentCollectionStrategy paymentCollectionStrategy1=new CardPaymenytCollection();
        Payment payment2=new Payment(displayStrategy1,paymentCollectionStrategy1);
        payment2.paymentCollection();
    }
}