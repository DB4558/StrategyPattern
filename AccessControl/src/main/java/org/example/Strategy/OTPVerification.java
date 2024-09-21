package org.example.Strategy;

public class OTPVerification implements VerificationStrategy{

    @Override
    public Boolean verify() {
      System.out.println("Verifying OTP");
      return true;
    }
}
