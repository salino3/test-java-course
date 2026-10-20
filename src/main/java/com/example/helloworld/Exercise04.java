package com.example.helloworld;

import java.util.Scanner;

public class Exercise04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // System.out.print("Enter your name: ");

        // String name = scanner.nextLine();

        // System.out.print("Enter your age: ");
        // int age = scanner.nextInt();
        // System.out.print("Hello " + name + " of " + age + " years old");

        // System.out.print("What's the price of this dish? ");
        // double price = scanner.nextDouble();
        // System.out.print("The price is " + price);

        System.out.print("Are you a student? ");
        boolean isStudent = scanner.nextBoolean();
        System.out.print("I'm " + (isStudent ? "" : "not ") + "a student");

        scanner.close();
    }

}
