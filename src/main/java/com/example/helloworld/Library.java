package com.example.helloworld;

public class Library {

    Book[] books;

    public Library(Book[] initBooks) {
        books = initBooks;
    }

    // ---------------------------
    public static void main(String[] args) {
        Book book1 = new Book("El viaje de Joe", "Joe", 120, true);

        book1.printInfo();
        book1.borrowBook();
        book1.printInfo();
        book1.returnBook();
        book1.returnBook();
        book1.printInfo();
    }
}
