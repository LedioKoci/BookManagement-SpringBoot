package model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "\"Order\"")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "orderId", nullable = false)
    private Integer id;

    @OneToOne
    @JoinColumn(name = "userId", nullable = false)
    private User user;

    @Column(name = "orderDate", nullable = false)
    private Date orderDate;

    @Column(name = "status", nullable = false)
    private boolean status;

}
