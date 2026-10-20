package com.example.helloworld;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercise02 {
    static class Item {
        String name;
        double price;
        int quantity;

        public Item(String name, double price, int quantity) {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        public double getSubtotal() {
            return price * quantity;
        }
    }

    static class Order {
        String city;
        List<Item> items;

        public Order(String city, List<Item> items) {
            this.city = city;
            this.items = items;
        }

        public String getCity() {
            return city;
        }

        public List<Item> getItems() {
            return items;
        }
    }

    public static void main(String[] args) {

        List<Order> orders = List.of(
                new Order("Roma", List.of(
                        new Item("Laptop", 1000.0, 1),
                        new Item("Mouse", 25.0, 2))),
                new Order("Milano", List.of(
                        new Item("Tastiera", 80.0, 1))),
                new Order("Roma", List.of(
                        new Item("Monitor", 200.0, 2))));

        System.out.println(calculateRevenueByCity(orders));
    }

    // Esercizio:
    // Fatturato Totale
    // per Città
    // Hai una
    // lista di

    // ordini (List<Order>). Ogni ordine contiene un cliente con la sua
    // città e una lista di prodotti

    // acquistati (ciascuno con un prezzo e una quantità).

    // Scrivi una funzione che prenda la lista degli ordini e restituisca
    // una Map<String, Double> che associ a ogni città il fatturato totale
    // generato dagli ordini di quella città.
    public static Map<String, Double> calculateRevenueByCity(List<Order> orders) {
        return orders.stream()
                .collect(Collectors.groupingBy(
                        Order::getCity,
                        Collectors.summingDouble(order -> order.getItems().stream()
                                .mapToDouble(Item::getSubtotal)
                                .sum())));
    }
}
