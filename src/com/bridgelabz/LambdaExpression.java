package com.bridgelabz;
import java.util.Scanner;
import java.util.regex.Pattern;
@FunctionalInterface
interface FirstName {
    public String validate(String regex, String field);
}

public class LambdaExpression {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Name: ");
        String field = sc.next();
        FirstName isValidFirstName = (pattern, firstName) -> {

            return "The input provided is " + Pattern.compile(pattern).matcher(firstName).matches();
        };

        System.out.println(isValidFirstName.validate("^[A-Z]{1}[a-z]{3,}$", field));
    }
}