package org.example;

public class UPIPaymentCollection implements PaymentCollectionStrategy{


    @Override
    public void collectPayment(){
        System.out.println("Collecting Payment via UPI");
    }
}
