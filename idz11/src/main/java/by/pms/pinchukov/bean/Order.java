package by.akarumey.project.bean;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

import static javax.persistence.GenerationType.IDENTITY;

@Getter
@Setter
@Entity(name = "_order")
public class Order {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    private Client client;

    @NotNull
    @ManyToOne(optional = false)
    private Tour tour;

    @NotNull
    @ManyToOne(optional = false)
    private Hotel hotel;

    @Column(nullable = false)
    private Integer price;

    @NotNull
    @Column(nullable = false)
    private String tourDate;

    @NotNull
    @Column(nullable = false)
    private int nights;

    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private LocalDateTime orderDate;
}
