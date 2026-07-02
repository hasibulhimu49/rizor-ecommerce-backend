package com.business.rizor_ecommerce_api.product.dto.response;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class ProductResponseDto {

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
}
