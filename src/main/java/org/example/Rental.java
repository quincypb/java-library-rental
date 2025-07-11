package org.example;

import java.time.LocalDate;

public class Rental {
    private Book book;
    private String renterName;
    private LocalDate rentalDate;

    public Rental(Book book, String renterName) {
        this.book = book;
        this.renterName = renterName;
        this.rentalDate = LocalDate.now();
    }

    public Book getBook() {
        return book;
    }

    public String getRenterName() {
        return renterName;
    }

    public LocalDate getRentalDate() {
        return rentalDate;
    }
}
