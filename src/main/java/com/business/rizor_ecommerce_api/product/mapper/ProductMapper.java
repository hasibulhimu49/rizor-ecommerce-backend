package com.business.rizor_ecommerce_api.product.mapper;

import com.business.rizor_ecommerce_api.product.dto.request.ProductCreateRequestDto;
import com.business.rizor_ecommerce_api.product.dto.response.ProductResponseDto;
import com.business.rizor_ecommerce_api.product.entity.Product;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    Product toEntity(ProductCreateRequestDto dto);
    ProductResponseDto toDto(Product product);
}
