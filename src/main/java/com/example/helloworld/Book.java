package com.example.helloworld;

public class Book extends BaseEntity {

    static private int counterId = 1;
    private int id;
    private String title;
    private String author;
    private int pages;
    private boolean available;

    public Book(String initTitle, String initAuthor, int initPages, boolean initAvailable) {
        super();
        this.title = initTitle;
        this.author = initAuthor;
        this.pages = initPages;
        this.available = initAvailable;
        this.id = counterId++;

    }

    @Override
    public int getGlobalId() {
        return super.getGlobalId();
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public void printInfo() {
        String bookAvailable = available ? "is available" : "is not available";
        String result = String.format("The book '%s' with author %s and %d pages %s ", title, author, pages,
                bookAvailable);
        System.out.println(result);
    }

    public void borrowBook() {
        String msg = available ? "The book " + title + " has been borrowed successfully."
                : "Sorry, the book " + title + " is already borrowed.";
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
