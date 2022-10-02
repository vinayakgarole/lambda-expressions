package com.bridgelabz;
import java.util.Scanner;
import java.util.regex.Pattern;
@FunctionalInterface
interface LastName {
    public String validate(String regex, String field);
}

public class LambdaExpression {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Last Name: ");
        String field = sc.next();
        LastName isValidLastName = (pattern, lastName) -> {

            return "The input provided is " + Pattern.compile(pattern).matcher(lastName).matches();
        };

        System.out.println(isValidLastName.validate("^[A-Z]{1}[a-z]{3,}$", field));
    }
}