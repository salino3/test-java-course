package com.example.helloworld;

import java.util.ArrayList;
// import java.util.Arrays;
import java.util.List;

public class Library {

    // Book[] books;
    private List<Book> books;

    public Library(List<Book> initBooks) {
        books = initBooks;
    }

    // Second constructor in case I want initialize an empty Library
    public Library() {
        this.books = new ArrayList<>();
    }

    public List<Book> getBooks() {
        return books;
    }

    //
    void listBooks() {
        for (int i = 0; i < books.size(); i++) {
            books.get(i).printInfo();
        }
    }

    //
    protected int numbersBooks() {
        System.out.println("the library has " + books.size() + " books");
        return books.size();
    }

    //
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Added book " + book.getTitle() + " in to the library");
    }

    //
    void borrowBookByTitle(String targetTitle) {
        books.stream()
                .filter(b -> b.getTitle().equalsIgnoreCase(targetTitle))
                .findFirst()
                .ifPresentOrElse(
                        Book::borrowBook,
                        () -> System.out.println("Book with title '" + targetTitle + "' not found."));
    }

    //
    void returnBookByTitle(String targetTitle) {
        books.stream()
                .filter(b -> b.getTitle().equalsIgnoreCase(targetTitle))
                .findFirst()
                .ifPresentOrElse(
                        Book::returnBook,
                        () -> System.out.println("Book with title '" + targetTitle + "' not found."));
    }

    // ---------------------------
    public static void main(String[] args) {
        Book book1 = new Book("El viaje de Joe", "Joe", 120, true);
        Book book2 = new Book("Java Programming", "Jane Smith", 350, true);
        Book book3 = new Book("Clean Code", "Robert C. Martin", 464, false);
        Book bookCreated1 = new Book("`La livella", "Totò", 20, true);

        List<Book> booksArray = new ArrayList<>();
        booksArray.add(0, book1);
        booksArray.add(1, book2);
        booksArray.add(2, book3);

        book1.printInfo();
        book1.borrowBook();
        book1.returnBook();
        book1.returnBook();

        Library library1 = new Library(booksArray);

        library1.listBooks();
        library1.borrowBookByTitle("Java Programming");
        library1.returnBookByTitle("Java Programming");
        library1.returnBookByTitle("Java Programming");
        library1.borrowBookByTitle("Java Programming");
        library1.borrowBookByTitle("Ciao Roma!");
        System.out.println("------------------------------------");
        library1.addBook(bookCreated1);
        library1.listBooks();
        library1.numbersBooks();

    }
}
