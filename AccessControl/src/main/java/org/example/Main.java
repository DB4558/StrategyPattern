package org.example;

import org.example.Context.AccessControl;
import org.example.Strategy.*;

public class Main {
    public static void main(String[] args) {

        PromptStrategy promptStrategy=new Passwordprompt();
        VerificationStrategy verificationStrategy=new PasswordVerification();
        AccessControl accessControl=new AccessControl(promptStrategy,verificationStrategy);
        accessControl.authenticate();

        PromptStrategy promptStrategy1=new OTPPrompt();
        VerificationStrategy verificationStrategy1=new OTPVerification();
        AccessControl accessControl1=new AccessControl(promptStrategy1,verificationStrategy1);
        accessControl1.authenticate();
    }
}