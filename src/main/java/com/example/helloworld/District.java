package com.example.helloworld;

import java.util.List;
import java.util.stream.Collectors;

public class District {

    private List<Library> libraries;
    private String name;
    private int numberUsers;
    private int numberBooks;

    public District(List<Library> initLibraries, String initName, int initNumbersUsers, int initNumberBooks) {
        libraries = initLibraries;
        name = initName;
        numberUsers = initNumbersUsers;
        numberBooks = numbersBooksFn();
    }

    public int numbersBooksFn() {
        int result = libraries.stream()
                .mapToInt(Library::numbersBooks).sum();

        System.out.println("The district has " + libraries.size() + " and in total has " + result + " books");
        return result;
    }

    public List<Library> getLibraries() {
        return libraries;
    }

    public String getName() {
        return name;
    }

    public int getNumberBooks() {
        return numberBooks;
    }

    public int getNumberUsers() {
        return numberUsers;
    }
}
