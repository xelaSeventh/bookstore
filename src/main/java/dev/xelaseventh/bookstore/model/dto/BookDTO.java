package dev.xelaseventh.bookstore.model.dto;

import dev.xelaseventh.bookstore.model.Review;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
// Lombok Annotations
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookDTO {
    private String bookId;
    private String bookTitle;
    private String bookAuthor;
    private Date publicationDate;
    private Double bookPrice;
    private Review bookReview;
}
