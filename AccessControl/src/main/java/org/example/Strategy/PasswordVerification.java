package org.example.Strategy;

public class PasswordVerification implements VerificationStrategy{
    @Override
    public Boolean verify() {
       System.out.println("Verifying Password");
       return true;
    }
}
