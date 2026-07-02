package com.business.rizor_ecommerce_api.product.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "categories_table")
@Getter
@Setter
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Integer level;

    @ManyToOne
    @JoinColumn(name = "parent_category_id")
    private Category parentCategory;

    @OneToMany(mappedBy = "parentCategory", cascade = CascadeType.ALL)
    private List<Category> childCategories = new ArrayList<>();

    @OneToMany(mappedBy = "category")
    private List<Product> products = new ArrayList<>();
}


//Electronics
//├── Mobile
//│   ├── Android
//│   └── iPhone
//├── Laptop
//└── Camera