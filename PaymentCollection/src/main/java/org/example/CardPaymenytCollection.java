package org.example;

public class CardPaymenytCollection implements PaymentCollectionStrategy{
    @Override
    public void collectPayment() {
        System.out.println("Collecting Payment via Card");
    }
}
