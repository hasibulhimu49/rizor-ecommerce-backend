package com.business.rizor_ecommerce_api.product.repository;

import com.business.rizor_ecommerce_api.product.dto.response.ProductResponseDto;
import com.business.rizor_ecommerce_api.product.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long>, JpaSpecificationExecutor<Product> {
//    Page<Product> findAll(Pageable pageable);
}
