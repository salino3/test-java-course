package com.example.helloworld;

import java.util.List;

public class District {

    private List<Library> libraries;
    private String name;
    private int numberUsers;
    private int numberBooks;

    public District(List<Library> initLibraries, String initName, int initNumbersUsers, int initNumberBooks) {
        libraries = initLibraries;
        name = initName;
        numberUsers = initNumbersUsers;
        numberBooks = libraries.size();
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
