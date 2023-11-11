package dev.xelaseventh.bookstore.controller;

import dev.xelaseventh.bookstore.exceptions.BookNotFoundException;
import dev.xelaseventh.bookstore.exceptions.InvalidIdException;
import dev.xelaseventh.bookstore.model.dto.BookDTO;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

// Spring Annotation
@RestController
public class BookController {
    // CRUD Operations -inbuilt methods

    //Create
    void addBook(BookDTO bookDTO){

    }
    //Update
    void updateBook(BookDTO bookDTO){

    }
    //Delete
    void deleteBook(String bookId){

    }
    //Read
    List<BookDTO> getAll(){

        return null;
    }

    // Query
    BookDTO getById(String bookId){

        return null;
    }
    // Derived Query
    List<BookDTO> getByTitle(String bookTitle){

        return null;
    }
    List<BookDTO> getByAuthor(String bookAuthor){

        return null;
    }
    // Custom Query
    List<BookDTO> getByPublicationDate(Date publicationDate){

        return null;
    }
    List<BookDTO> getByTitleAndLesserPrice(String bookTitle, Double bookPrice){

        return null;
    }
}
