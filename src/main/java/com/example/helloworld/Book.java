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
        String result = String.format("The book '%s' with author %s and %d %s ", title, author, pages, bookAvailable);
        System.out.println(result);
    }

    public static void main(String[] args) {
        Book book1 = new Book("test title", "Joe", 120, true);

        book1.printInfo();
    }
}
