package com.business.rizor_ecommerce_api.cart.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "cart_table")
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
