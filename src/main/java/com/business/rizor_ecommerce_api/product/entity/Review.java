package com.business.rizor_ecommerce_api.product.entity;


import com.business.rizor_ecommerce_api.user.entity.User;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.IdGeneratorType;

@Entity
@Table(name = "reviews_table")
@Getter
@Setter
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String reviewText;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;


    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
}
