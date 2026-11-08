package com.example.helloworld;

import java.util.ArrayList;
import java.util.List;

public class CityExercise {

    static public void main(String[] args) {

        City roma = new City("Roma", -753);

        // -----------------------
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

        // -----------------------
        Book book4 = new Book("El viaje de Joe", "Joe", 120, true);
        Book book5 = new Book("Typescript", "Joe Smith", 390, true);
        Book book6 = new Book("Clean Code", "Robert C. Martin", 464, false);

        Library myLibrary3 = new Library();
        myLibrary3.addBook(new Book("Java Programming", "Jane Smith", 350, true));
        myLibrary3.addBook(book4);

        Library myLibrary4 = new Library();
        myLibrary4.addBook(book5);
        myLibrary4.addBook(book6);

        List<Library> librariesList2 = new ArrayList<>();
        librariesList2.add(myLibrary3);
        librariesList2.add(myLibrary4);

        District trastevereDistrict = new District(librariesList2, "Trastevere", 12000);

        // ------------------
        System.out.println("# " + roma.getName() + " --------------------------------");
        roma.addDistrict(centralDistrict);
        roma.addDistrict(trastevereDistrict);

        System.out.println(roma.calculateTotalBooksInCity());
        roma.getAllLibraries().get(3).borrowBookByTitle("Typescript");
        roma.printCityInfo();
        // -----------------------------
        Emperor augustus = new Emperor("Iulia", "Ottaviano Augusto", 76);

        Person mario = new Person("Mario", RolePerson.legionary, 39);

        roma.addCitizen(augustus);
        roma.addCitizen(mario);
        roma.printCityInfo();
        System.out.println(augustus.getName() + " Global ID: " + augustus.getGlobalId());
        System.out.println(augustus.getName() + " Personal ID: " + augustus.getId());
        System.out.println(mario.getName() + " Personal ID: " + mario.getId());
        System.out.println(roma.getName() + " Global ID: " + roma.getGlobalId());

    }
}
