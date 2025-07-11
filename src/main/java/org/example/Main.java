package org.example;  // concept of a folder


public class Main {
    public static void main(String[] args){
        Library library = new Library();

        Author author1 = new Author("George Clooney");
        Book book1 = new Book("Oceans 11", author1);
        Book book2 = new Book("Oceans 13", author1);

        library.addBook(book1);
        library.addBook(book2);

        library.printAllBooks();

        System.out.println("Rening sf");
        library.rentBook(book1, "Alice");

        library.printAllBooks();





    }


}