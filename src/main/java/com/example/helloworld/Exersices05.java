package com.example.helloworld;

import java.util.Scanner;

public class Exersices05 {
    public static void main(String[] args) {
        loops();
    }

    static void loops() {
        Scanner scanner = new Scanner(System.in);

        String name = "";

        while (name.isEmpty()) {
            System.out.println("Enter your name:");
            name = scanner.nextLine();
        }
        ;

        System.out.println("Hello " + name);

        Integer age = null;

        do {
            System.out.println("What's your age?");

            if (scanner.hasNextInt()) {
                age = scanner.nextInt();
            } else {
                System.out.println("Error: insert a valid number");
                scanner.next();
                age = -1;
            }

        } while (age == null || age < 0);

        System.out.println("My age is " + age);

        scanner.close();
    }
}
