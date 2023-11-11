package dev.xelaseventh.bookstore.repository;

import dev.xelaseventh.bookstore.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
// Spring Annotation
@Repository
public interface BookRepository extends MongoRepository<Book, String> {
}
