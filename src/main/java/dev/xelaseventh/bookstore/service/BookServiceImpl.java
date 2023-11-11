package dev.xelaseventh.bookstore.service;

import dev.xelaseventh.bookstore.exceptions.BookNotFoundException;
import dev.xelaseventh.bookstore.exceptions.InvalidIdException;
import dev.xelaseventh.bookstore.model.Book;
import dev.xelaseventh.bookstore.model.dto.BookDTO;
import dev.xelaseventh.bookstore.model.mapper.BookMapper;
import dev.xelaseventh.bookstore.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

// Spring Annotation
@Service
public class BookServiceImpl implements BookService {

    // Repository Injection
    @Autowired
    private BookRepository bookRepository;
    // Mapper Injection
    @Autowired
    private BookMapper bookMapper;

    @Override
    public void addBook(BookDTO bookDTO) {
        // BookDTO to Book Conversion
        Book book = bookMapper.convertToBook(bookDTO);
        bookRepository.insert(book);
    }

    @Override
    public void updateBook(BookDTO bookDTO) {
        // BookDTO to Book Conversion
        Book book = bookMapper.convertToBook(bookDTO);
        bookRepository.save(book);
    }

    @Override
    public void deleteBook(String bookId) {
        bookRepository.deleteById(bookId);
    }

    @Override
    public List<BookDTO> getAll() {
        List<Book> books = bookRepository.findAll();
        // Book to BookDTO Conversion
        List<BookDTO> bookList = books.stream()
                .map(book -> bookMapper.convertToDto(book))
                .toList();
        return bookList;
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
