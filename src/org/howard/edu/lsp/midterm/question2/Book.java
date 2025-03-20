package org.howard.edu.lsp.midterm.question2;

/**
 * The Book class represents a book with a title, author, ISBN, and year published.
 */
public class Book {
    private String title;
    private String author;
    private String ISBN;
    private int yearPublished;

    /**
     * Constructs a new Book with the specified title, author, ISBN, and year published.
     *
     * @param title the title of the book
     * @param author the author of the book
     * @param ISBN the ISBN of the book
     * @param yearPublished the year the book was published
     */
    public Book(String title, String author, String ISBN, int yearPublished) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.yearPublished = yearPublished;
    }

    /**
     * Returns the title of the book.
     *
     * @return the title of the book
     */
    public String getTitle() {
        return title;
    }

    /**
     * Returns the author of the book.
     *
     * @return the author of the book
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Returns the ISBN of the book.
     *
     * @return the ISBN of the book
     */
    public String getISBN() {
        return ISBN;
    }

    /**
     * Returns the year the book was published.
     *
     * @return the year the book was published
     */
    public int getYearPublished() {
        return yearPublished;
    }

    /**
     * Compares this book to the specified object. The result is true if and only if the argument is not null and is a Book object that has the same title, author, ISBN, and year published as this book.
     *
     * @param obj the object to compare this book against
     * @return true if the given object represents a Book equivalent to this book, false otherwise
     */
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

    /**
     * Returns a string representation of the book. The string representation consists of the title, author, ISBN, and year published.
     *
     * @return a string representation of the book
     */
    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + ISBN + ", Year Published: " + yearPublished;
    }
}