package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;
@FunctionalInterface
interface MobileNumber {
    public String validate(String regex, String input);
}

public class UserRegistration {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Mobile Number with Country Code: ");
        String input = sc.next();
        MobileNumber isValidMobileNumber = (pattern, MobileNumber) -> {

            return "The input provided is " + Pattern.compile(MobileNumber).matcher(MobileNumber).matches();
        };

        System.out.println(isValidMobileNumber.validate("^[0-9]{2}\\s{1}[0-9]{10}$", input));
    }
}