package dev.xelaseventh.bookstore.service;

import dev.xelaseventh.bookstore.exceptions.BookNotFoundException;
import dev.xelaseventh.bookstore.exceptions.InvalidIdException;
import dev.xelaseventh.bookstore.model.dto.BookDTO;

import java.util.Date;
import java.util.List;

public class BookServiceImpl implements BookService {
    @Override
    public void addBook(BookDTO bookDTO) {

    }

    @Override
    public void updateBook(BookDTO bookDTO) {

    }

    @Override
    public void deleteBook(String bookId) {

    }

    @Override
    public List<BookDTO> getAll() {
        return null;
    }

    @Override
    public BookDTO getById(String bookId) throws InvalidIdException {
        return null;
    }

    @Override
    public List<BookDTO> getByTitle(String bookTitle) throws BookNotFoundException {
        return null;
    }

    @Override
    public List<BookDTO> getByAuthor(String bookAuthor) throws BookNotFoundException {
        return null;
    }

    @Override
    public List<BookDTO> getByPublicationDate(Date publicationDate) throws BookNotFoundException {
        return null;
    }

    @Override
    public List<BookDTO> getByTitleAndLesserPrice(String bookTitle, Double bookPrice) throws BookNotFoundException {
        return null;
    }
}
