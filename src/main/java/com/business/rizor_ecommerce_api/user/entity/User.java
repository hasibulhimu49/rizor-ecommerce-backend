package com.business.rizor_ecommerce_api.user.entity;

import com.business.rizor_ecommerce_api.common.enums.Role;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import com.business.rizor_ecommerce_api.common.audit.BaseEntity;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users_table")
@Getter
@Setter
public class User extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name="fullname")
    private String fullName;

    @Column(name="username", unique = true)
    private String username;

    @Column(name="password")
    private String password;

    @Column(name="email", unique = true)
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "assigning_role")
    @Enumerated(EnumType.STRING)
    private Role role;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Address> address = new ArrayList<>();

//    @ElementCollection
//    @CollectionTable(name = "paymenent_information",joinColumns = @JoinColumn(name = "userId"))
//    private List<PaymentInformation> paymentInformations=new ArrayList<>();


}
