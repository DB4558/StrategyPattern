package org.example;

public class CardDisplay implements DisplayStrategy{

    @Override
    public void display() {
        System.out.println("Display Screen for Card");
    }
}
