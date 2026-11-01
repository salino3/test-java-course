package com.example.helloworld;

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

    // ---------------------------
    public static void main(String[] args) {
        Book book1 = new Book("El viaje de Joe", "Joe", 120, true);
        Book book2 = new Book("Java Programming", "Jane Smith", 350, true);
        Book book3 = new Book("Clean Code", "Robert C. Martin", 464, false);

        Book[] booksArray = { book1, book2, book3, };

        book1.printInfo();
        book1.borrowBook();
        // book1.printInfo();
        book1.returnBook();
        book1.returnBook();
        // book1.printInfo();

        Library library1 = new Library(booksArray);

        library1.listBooks();
    }
}
