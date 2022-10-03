package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;
@FunctionalInterface
/*
 * Password Rule 1
 */
interface Password {
    public String validate(String regex, String field);
}

public class UserRegistration {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please login using 8 character Password: ");
        String input = sc.next();
        Password isValidPassword = (pattern, Password) -> {

            return "The input provided is " + Pattern.compile(Password).matcher(Password).matches();
        };

        System.out.println(isValidPassword.validate("^[a-zA-Z0-9]{8,}$", input));
    }
}