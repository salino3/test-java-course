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

        System.out.println("The district has " + libraries.size() + " library and in total has " + result + " books");
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

    public static void main(String[] args) {

        Book book1 = new Book("El viaje de Joe", "Joe", 120, true);
        Book book2 = new Book("Java Programming", "Jane Smith", 350, true);
        Book book3 = new Book("Clean Code", "Robert C. Martin", 464, false);

        Library myLibrary = new Library();
        myLibrary.addBook(new Book("Java Programming", "Jane Smith", 350, true));
        myLibrary.addBook(book1);

        Library myLibrary2 = new Library();
        myLibrary2.addBook(book2);
        myLibrary2.addBook(book3);

        List<Library> librariesList = new ArrayList<>();
        librariesList.add(myLibrary);
        librariesList.add(myLibrary2);

        District centralDistrict = new District(librariesList, "Centro Storico", 15000);

        System.out.println("District ------------------------------------");
        System.out.println(centralDistrict.getName());
        centralDistrict.calculateTotalBooks();

    };
}
