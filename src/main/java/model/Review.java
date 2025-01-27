package model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "\"Review\"")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id", nullable = false)
    private Book book;

    @ManyToOne
    @JoinColumn(name = "id", nullable = false)
    private User user;



}
