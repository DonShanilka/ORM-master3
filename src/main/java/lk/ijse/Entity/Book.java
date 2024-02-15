package lk.ijse.Entity;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table
public class Book {
    @Id
    private int id;
    private String title;
    private String publicationYear;
    private double price;
    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;
}
