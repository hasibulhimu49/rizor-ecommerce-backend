package com.business.rizor_ecommerce_api.product.dto.request;

import com.business.rizor_ecommerce_api.product.entity.Category;
import com.business.rizor_ecommerce_api.product.entity.Rating;
import com.business.rizor_ecommerce_api.product.entity.Review;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class ProductCreateRequestDto {

    private String title;
    private String description;
    private Integer price;
    private Integer discount;
    private Integer discountPrice;
    private Integer quantity;
    private String brand;
    private String imageUrl;
    private List<String> color =new ArrayList<>();
    private List<String> size=new ArrayList<>();
//    private List<Rating> rating;
//    private List<Review> review;
//    private Category category;
}
