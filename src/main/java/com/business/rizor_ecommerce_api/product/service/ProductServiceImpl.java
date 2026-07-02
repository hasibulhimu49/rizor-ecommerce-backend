package com.business.rizor_ecommerce_api.product.service;

import com.business.rizor_ecommerce_api.common.exception.ResourceNotFoundException;
import com.business.rizor_ecommerce_api.product.dto.request.ProductCreateRequestDto;
import com.business.rizor_ecommerce_api.product.dto.response.ProductResponseDto;
import com.business.rizor_ecommerce_api.product.entity.Product;
import com.business.rizor_ecommerce_api.product.mapper.ProductMapper;
import com.business.rizor_ecommerce_api.product.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService{

    private ProductRepository repository;
    private ProductMapper mapper;

    @Override
    public ProductResponseDto createProduct(ProductCreateRequestDto requestDto) {
        Product product= mapper.toEntity(requestDto);
        Product savedProduct= repository.save(product);
        return mapper.toDto(savedProduct);
    }

    @Override
    public ProductResponseDto getProductById(Long id) {

       Product product=repository.findById(id).orElseThrow(()->new ResourceNotFoundException("Cant find any product for id"+id));
       return mapper.toDto(product);
    }

    @Override
    public Page<ProductResponseDto> getAllProduct(int page, int size, Sort sort) {

        Pageable pageable= PageRequest.of(page,size,Sort.by(sort));
        Page<Product> products=repository.findAll(pageable);
        Page<ProductResponseDto> response=products.map(mapper::toDto);
        return response;
    }

    @Override
    public ProductResponseDto updateProduct(Long id, ProductCreateRequestDto updateDto) {
        Product product=repository.findById(id).orElseThrow(()->new ResourceNotFoundException("Cant find any product for id"+id));

        if (updateDto.getTitle() != null) {
            product.setTitle(updateDto.getTitle());
        }

        if (updateDto.getDescription() != null) {
            product.setDescription(updateDto.getDescription());
        }

        if (updateDto.getPrice() != null) {
            product.setPrice(updateDto.getPrice());
        }

        if (updateDto.getDiscount() != null) {
            product.setDiscount(updateDto.getDiscount());
        }

        if (updateDto.getDiscountPrice() != null) {
            product.setDiscountPrice(updateDto.getDiscountPrice());
        }

        if (updateDto.getQuantity() != null) {
            product.setQuantity(updateDto.getQuantity());
        }

        if (updateDto.getBrand() != null) {
            product.setBrand(updateDto.getBrand());
        }

        if (updateDto.getImageUrl() != null) {
            product.setImageUrl(updateDto.getImageUrl());
        }

       Product response= repository.save(product);
        return mapper.toDto(response);
    }

    @Override
    public Void deleteProduct(Long id) {
        Product product=repository.findById(id).orElseThrow(()->new ResourceNotFoundException("Cant find any product for id"+id));
         repository.delete(product);
         return null;
    }
}
