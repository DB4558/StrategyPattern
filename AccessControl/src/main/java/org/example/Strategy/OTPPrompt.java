package org.example.Strategy;

import java.util.Scanner;

public class OTPPrompt implements PromptStrategy{
    @Override
    public String prompt() {
        System.out.println("Enter OTP");
        Scanner scanner=new Scanner(System.in);
        String otp=scanner.nextLine();
        return  otp;
    }
}
