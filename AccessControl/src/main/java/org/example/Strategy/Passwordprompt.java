package org.example.Strategy;

import java.util.Scanner;

public class Passwordprompt implements PromptStrategy{
    @Override
    public String prompt() {
        System.out.println("Enter Password");
        Scanner scanner=new Scanner(System.in);
        String password=scanner.nextLine();
        return password;
    }
}
