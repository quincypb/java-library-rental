package org.example;

import java.util.*;

public class Library {
    private List<Book> books;
    private List<Rental> rentals;

    public Library() {
        books = new ArrayList<>();
        rentals = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getAvailableBooks() {
        List<Book> available = new ArrayList<>();
        for (Book b : books) {
            if (b.isAvailable()) {
                available.add(b);
            }
        }
        return available;
    }

    public boolean rentBook(Book book, String renterName) {
        if (book.isAvailable()) {
            book.setAvailable(false);
            rentals.add(new Rental(book, renterName));
            return true;
        }
        return false;
    }

    public void printAllBooks() {
        for (Book b : books) {
            System.out.println(b.getTitle() + " by " + b.getAuthor().getName() +
                    (b.isAvailable() ? " [Available]" : " [Rented]"));
        }
    }
}

