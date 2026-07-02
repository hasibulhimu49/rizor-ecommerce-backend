package com.business.rizor_ecommerce_api.card.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cardHolderName;

    private String cardNumber;

    private String expirationDate;

    private String cvv;

}
