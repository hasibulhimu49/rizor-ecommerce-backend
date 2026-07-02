package com.business.rizor_ecommerce_api.product.service;

import com.business.rizor_ecommerce_api.product.dto.request.ProductCreateRequestDto;
import com.business.rizor_ecommerce_api.product.dto.response.ProductResponseDto;
import com.business.rizor_ecommerce_api.product.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {

    ProductResponseDto createProduct(ProductCreateRequestDto requestDto);

    ProductResponseDto getProductById(Long id);

    Page<ProductResponseDto> getAllProduct(int page, int size, Sort sort);

    ProductResponseDto updateProduct(Long id, ProductCreateRequestDto updateDto);

    Void deleteProduct(Long id);
}
