package com.business.rizor_ecommerce_api.user.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "address_table")
@Getter
@Setter
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String city;

    private String state;

    private String street;

    private String zip;


    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;


}
