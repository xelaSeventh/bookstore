package dev.xelaseventh.bookstore.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

// Lombok Annotations
@Data
@AllArgsConstructor
@NoArgsConstructor
// Spring Data Annotations
@Document
public class Review {
    private String reviewAuthor;
    private String reviewBody;
}
