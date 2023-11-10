package dev.xelaseventh.bookstore.exceptions;

public class BookNotFoundException extends RuntimeException {


    // Constructors
    public BookNotFoundException() {
        super();
    }

    public BookNotFoundException(String message) {
        super(message);
    }

}
