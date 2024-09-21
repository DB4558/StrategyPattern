package org.example.Context;

import org.example.Strategy.PromptStrategy;
import org.example.Strategy.VerificationStrategy;

public class AccessControl {
    PromptStrategy promptStrategy;
    VerificationStrategy verificationStrategy;
    public AccessControl(PromptStrategy p,VerificationStrategy v){
        this.promptStrategy=p;
        this.verificationStrategy=v;
    }

    public void authenticate(){
        String userinput=promptStrategy.prompt();
        if(verificationStrategy.verify())
            System.out.println("Log in successful");
        else
            System.out.println("Login Failed");
    }
}
