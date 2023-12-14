package com.ra.entity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Orderdetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private int quantity;
    private double price;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "orderId", referencedColumnName = "oderId")
    private Orders order;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "productId", referencedColumnName = "productId")
    private Product product;


}
