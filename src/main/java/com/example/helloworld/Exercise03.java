package com.example.helloworld;

import javax.swing.plaf.basic.BasicTreeUI.SelectionModelPropertyChangeHandler;

public class Exercise03 {
    static int age;
    static int year = 2026;
    static double ageDouble = 60.2;
    int quantity = 1;
    double price = 19.99;
    double gpa = 3.5;
    static double temperature = -11.5;

    static char grade = 'A';
    static char symbol = '!';
    static char currency = '$';

    static boolean isStudent = true;
    static boolean isOnline = true;

    public static void main(String[] args) {

        System.out.println("This year is " + year);
        System.out.println("The temperature now is " + temperature + "ºC");
        System.out.println("The char is " + symbol);
        System.out.println("Tom is" + (isStudent ? "" : " not") + " a student");

        if (isOnline) {
            System.out.println("You are online!");

        } else {
            System.out.println("You are NOT online!");
        }
        //
        String name = "Joe";
        String surname = "Doe";

        System.out.println("Your complete name is " + name + " " + surname);
    }
}
