package dev.xelaseventh.bookstore.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
// Lombok Annotations
@Data
@AllArgsConstructor
@NoArgsConstructor
// Spring Data Annotations
@Document
public class Book {
    @Id
    private String bookId;
    private String bookTitle;
    private String bookAuthor;
    private Date publicationDate;
    private Double bookPrice;
    private Review bookReview;
}
