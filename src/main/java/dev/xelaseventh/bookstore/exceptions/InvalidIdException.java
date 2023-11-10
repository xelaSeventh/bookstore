package dev.xelaseventh.bookstore.exceptions;

public class InvalidIdException extends RuntimeException {


    // Constructors
    public InvalidIdException() {
        super();
    }

    public InvalidIdException(String message) {
        super(message);
    }

}
