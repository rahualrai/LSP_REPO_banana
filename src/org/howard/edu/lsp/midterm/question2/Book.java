package org.howard.edu.lsp.midterm.question2;

public class Book {
    private String title;
    private String author;
    private String ISBN;
    private int yearPublished;

    // constructor for Book
    public Book(String title, String author, String ISBN, int yearPublished) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.yearPublished = yearPublished;
    }

    // getters for Book
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getISBN() {
        return ISBN;
    }
    public int getYearPublished() {
        return yearPublished;
    }

    // equals method for Book
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return yearPublished == book.yearPublished &&
                title.equals(book.title) &&
                author.equals(book.author) &&
                ISBN.equals(book.ISBN);
    }

    // toString method for Book
    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + ISBN + ", Year Published: " + yearPublished;
    }

    public static void main(String[] args) {
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "123456789", 1925);
        Book book2 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "123456789", 1925);
        Book book3 = new Book("A Promised Land", "Barack Obama", "9780593239681", 2020);

        System.out.println(book1.equals(book2));
        System.out.println(book1.equals(book3));
        System.out.println(book1);
    }

}
