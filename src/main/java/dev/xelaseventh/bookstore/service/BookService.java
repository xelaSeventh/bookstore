package dev.xelaseventh.bookstore.service;

import dev.xelaseventh.bookstore.exceptions.BookNotFoundException;
import dev.xelaseventh.bookstore.exceptions.InvalidIdException;
import dev.xelaseventh.bookstore.model.dto.BookDTO;

import java.util.Date;
import java.util.List;

public interface BookService {
    // CRUD Operations -inbuilt methods

    //Create
    void addBook(BookDTO bookDTO);
    //Update
    void updateBook(BookDTO bookDTO);
    //Delete
    void deleteBook(String bookId);
    //Read
    List<BookDTO> getAll();

    // Query
    BookDTO getById(String bookId) throws InvalidIdException;
    // Derived Query
    List<BookDTO> getByTitle(String bookTitle) throws BookNotFoundException;
    List<BookDTO> getByAuthor(String bookAuthor) throws BookNotFoundException;
    // Custom Query
    List<BookDTO> getByPublicationDate(Date publicationDate) throws BookNotFoundException;
    List<BookDTO> getByTitleAndLesserPrice(String bookTitle, Double bookPrice) throws BookNotFoundException;
}
