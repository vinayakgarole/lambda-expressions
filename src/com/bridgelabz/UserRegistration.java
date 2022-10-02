package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;
@FunctionalInterface
interface EmailID {
    public String validate(String regex, String input);
}

public class UserRegistration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Email ID: ");
        String input = sc.next();
        EmailID isValidEmailID = (pattern, emailID) -> {

            return "The password given is " + Pattern.compile(pattern).matcher(emailID).matches();
        };

        System.out.println(isValidEmailID.validate("^[a-zA-Z0-9]+([+_.-][a-zA-Z0-9]+)*[@][a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?", input));
    }
}