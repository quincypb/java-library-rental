package org.example;

public class Book {
    // book needs author title add final
    private String title;
    private Author author;
    private boolean isAvailable;





    public Book(String title, Author author){
        this.title=title;
        this.author = author;
        this.isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
    public void setAvailable(boolean available){
        this.isAvailable = available;
    }
}
