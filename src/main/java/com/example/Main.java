// mvn clean package
package com.example;

import java.util.List;

public class Main {

    record Car(String type, String make, String model, Integer engineCapacity) {

    }

    public static void main(String[] args) {
        // List.of() it creates immutable list
        List<Car> cars = List.of(
                new Car("sedan", "BMW", "530", 1998),
                new Car("sedan", "Audi", "A5", 1998),
                new Car("sedan", "Mercedes", "E-Class", 2500),
                new Car("hatback", "Skoda", "530", 1600),
                new Car("hatback", "Toyota", "530", 1450));
    }
}