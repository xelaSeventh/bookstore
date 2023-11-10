package dev.xelaseventh.bookstore.model.mapper;

import dev.xelaseventh.bookstore.model.Book;
import dev.xelaseventh.bookstore.model.dto.BookDTO;
import org.springframework.stereotype.Component;
// Spring Annotation
@Component
public class BookMapper {

    // Method to convert Book object into Book DTO
    public BookDTO convertToDto(Book book) {
        BookDTO bookDTO = new BookDTO();
        bookDTO.setBookId(book.getBookId());
        bookDTO.setBookTitle(book.getBookTitle());
        bookDTO.setBookAuthor(book.getBookAuthor());
        bookDTO.setPublicationDate(book.getPublicationDate());
        bookDTO.setBookPrice(book.getBookPrice());
        bookDTO.setBookReview(book.getBookReview());

        return bookDTO;
    }

    // Method to convert Book DTO into Book Object
    public Book convertToDto(BookDTO bookDTO) {
        Book book = new Book();
        book.setBookId(bookDTO.getBookId());
        book.setBookTitle(bookDTO.getBookTitle());
        book.setBookAuthor(bookDTO.getBookAuthor());
        book.setPublicationDate(bookDTO.getPublicationDate());
        book.setBookPrice(bookDTO.getBookPrice());
        book.setBookReview(bookDTO.getBookReview());

        return book;
    }
}
