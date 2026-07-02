package com.business.rizor_ecommerce_api.product.entity;

import com.business.rizor_ecommerce_api.common.audit.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "products_table")
@Getter
@Setter
public class Product extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private Integer price;
    private Integer discount;
    private Integer discountPrice;
    private Integer quantity;
    private String brand;
    private String imageUrl;

    @ElementCollection
    private List<String> color =new ArrayList<>();

    @ElementCollection
    private List<String> size=new ArrayList<>();

    @OneToMany(mappedBy = "product")
    private List<Rating> rating;

    @OneToMany(mappedBy = "product")
    private List<Review> review;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;


}
