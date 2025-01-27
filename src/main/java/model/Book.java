package model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "\"Book\"")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "title")
    private String title;

    @Column(name = "author")
    private String author;

    @Column(name = "price")
    private float price;

    @Column(name = "description")
    private String description;

}
