package com.example.helloworld;

public class Book {

    private String title;
    private String author;
    private int pages;
    private boolean available;

    public Book(String initTitle, String initAuthor, int initPages, boolean initAvailable) {
        title = initTitle;
        author = initAuthor;
        pages = initPages;
        available = initAvailable;

    }

    public void printInfo() {
        String bookAvailable = available ? "is available" : "is not available";
        String result = String.format("The book '%s' with author %s and %d pages %s ", title, author, pages,
                bookAvailable);
        System.out.println(result);
    }

    public void borrowBook() {
        String msg = available ? "The book has been borrowed successfully." : "Sorry, the book is already borrowed.";
        if (available) {
            available = false;
        }
        System.out.println(msg);
    }

    public void returnBook() {

        boolean isAvailable = available;

        available = true;

        String msg = isAvailable ? "The book has been already returned successfully."
                : "The book has been returned successfully.";

        System.out.println(msg);

    }

}
