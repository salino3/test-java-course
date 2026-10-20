package com.example.helloworld;

import java.util.Scanner;

public class Exrcise04 {

    public static void menu(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");

        String name = scanner.nextLine();
        scanner.close();
    }

}
