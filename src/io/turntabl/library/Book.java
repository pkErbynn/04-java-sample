package io.turntabl.library;

public class Book {
    private String author;
    private String title;
    private int isbn;
    private BookCategory bookCategory;
    private BookState sate;

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", isbn=" + isbn +
                ", category=" + bookCategory +
                ", sate=" + sate +
                '}';
    }

    public Book(String author, String title, int isbn, BookCategory bookCategory, BookState sate) {
        this.author = author;
        this.title = title;
        this.isbn = isbn;
        this.bookCategory = bookCategory;
        this.sate = sate;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getIsbn() {
        return isbn;
    }

    public BookCategory getBookCategory() {
        return bookCategory;
    }

    public BookState getSate() {
        return sate;
    }
}
