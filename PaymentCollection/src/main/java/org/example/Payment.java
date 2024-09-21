package org.example;

public class Payment {

    DisplayStrategy displayStrategy;
    PaymentCollectionStrategy paymentCollectionStrategy;
    public Payment(DisplayStrategy d,PaymentCollectionStrategy p){
        this.displayStrategy=d;
        this.paymentCollectionStrategy=p;
    }

    public void paymentCollection(){
        displayStrategy.display();
        paymentCollectionStrategy.collectPayment();
    }
}
