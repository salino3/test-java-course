package com.example.helloworld;

import java.util.Scanner;

public class Exersices05 {
    public static void main(String[] args) {
        // loops();
        methods();
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

        //
        // 'continue' = skip current iteration and continue the loop
        // 'break' = break out of a loop (stop)

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.print(i + " "); // 0 1 2 3 4 6 7 8 9
        }

        System.out.print("\n");

        for (int i = 0; i > -10; --i) {
            if (i == -5) {
                break;
            }
            System.out.print(i + " "); // 0 -1 -2 -3 -4
        }
    }

    static void methods() {
        happyBirthday("Joe");

    }

    static void happyBirthday(String name) {
        System.out.println("Happy birthday to you!");
        System.out.println("You are " + name + " years old!");
        System.out.println("Happy birthday to you!");
        System.out.println("Happy birthday to you!");
    }
}
