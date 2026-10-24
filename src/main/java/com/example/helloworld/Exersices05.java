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

        scanner.close();
    }
}
