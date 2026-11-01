package com.example.helloworld;

import java.util.Arrays;

public class Library {

    Book[] books;

    public Library(Book[] initBooks) {
        books = initBooks;
    }

    void listBooks() {
        for (int i = 0; i < books.length; i++) {
            books[i].printInfo();
        }

    }

    void borrowBookByTitle(String targetTitle) {
        Arrays.stream(books)
                .filter(b -> b.getTitle().equalsIgnoreCase(targetTitle))
                .findFirst()
                .ifPresentOrElse(
                        Book::borrowBook,
                        () -> System.out.println("Book with title '" + targetTitle + "' not found.")

                );
    }

    // ---------------------------
    public static void main(String[] args) {
        Book book1 = new Book("El viaje de Joe", "Joe", 120, true);
        Book book2 = new Book("Java Programming", "Jane Smith", 350, true);
        Book book3 = new Book("Clean Code", "Robert C. Martin", 464, false);

        Book[] booksArray = { book1, book2, book3, };

        book1.printInfo();
        book1.borrowBook();
        book1.returnBook();
        book1.returnBook();

        Library library1 = new Library(booksArray);

        library1.listBooks();
        library1.borrowBookByTitle("Java Programming");
        library1.borrowBookByTitle("Java Programming");
        library1.borrowBookByTitle("Ciao Roma!");
    }
}
