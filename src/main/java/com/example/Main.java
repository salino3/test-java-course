// mvn clean package
package com.example;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

        List<Car> sedanCars = cars.stream().filter(car -> car.type().equals("sedan")).collect(Collectors.toList());

        List<String> carMakeList = cars.stream().map(car -> car.make).toList();

        System.out.println(carMakeList);

        List<String> carMakeModelList = cars.stream().flatMap(car -> Stream.of(car.make, car.model)).toList();

        System.out.println(carMakeModelList);

        // Stream you can use once
        Stream<Integer> integerStream = Stream.of(10, 11, 12, 13, 14, 15);
        System.out.println("clog1:" + integerStream);
        System.out.println(Stream.of(10, 11, 12, 13, 14, 15) == integerStream); // false
        System.out.println(Stream.of(10, 11, 12, 13, 14, 15) == Stream.of(10, 11, 12, 13, 14, 15)); // false
        List<Integer> list = integerStream.toList();
        System.out.println("clog2: " + list);

        Stream<Integer> filteredIntegerStream = Stream.of(10, 11, 12, 13, 14, 15).filter(i -> {
            System.out.println("Filtering integer");
            return i % 2 == 0;
        });

        System.out.println("Count: " + filteredIntegerStream.toList());

        Map<Boolean, List<Car>> partitionedCars = cars.stream()
                .collect(Collectors.partitioningBy(car -> car.type.equals("sedan")));

        System.out.println("Partitioned cars: " + partitionedCars);

    }

}