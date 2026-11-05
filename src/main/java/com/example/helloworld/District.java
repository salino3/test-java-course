package com.example.helloworld;

import java.util.ArrayList;
import java.util.List;

public class District {

    private List<Library> libraries;
    private String name;
    private int numberUsers;
    private int numberBooks;

    public District(List<Library> initLibraries, String initName, int initNumbersUsers) {
        libraries = initLibraries;
        name = initName;
        numberUsers = initNumbersUsers;
        numberBooks = calculateTotalBooks();
    }

    public int calculateTotalBooks() {
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

    public void main(String[] args) {

        Library myLibrary = new Library();
        myLibrary.addBook(new Book("Java Programming", "Jane Smith", 350, true));

        List<Library> librariesList = new ArrayList<>();
        librariesList.add(myLibrary);

        District centralDistrict = new District(librariesList, "Centro Storico", 15000);

    };
}
