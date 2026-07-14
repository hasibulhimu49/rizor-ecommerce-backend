package com.business.rizor_ecommerce_api.product.controller;

import com.business.rizor_ecommerce_api.product.dto.request.ProductCreateRequestDto;
import com.business.rizor_ecommerce_api.product.dto.response.ProductResponseDto;
import com.business.rizor_ecommerce_api.product.service.ProductService;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/products")
@AllArgsConstructor
@Tag(name = "Products API",description = "APIs for managing Products in the system")
//@SecurityRequirement(name = "bearerAuth")
public class ProductController {

    private final ProductService service;

    @PostMapping
    public ProductResponseDto createProduct(@RequestBody ProductCreateRequestDto requestDto){
        return service.createProduct(requestDto);
    }

    @GetMapping("/{id}")
    public ProductResponseDto getProductById(@PathVariable Long id){
        return service.getProductById(id);
    }

    @GetMapping
    public ResponseEntity<Page<ProductResponseDto>> getAllProduct(@RequestParam(defaultValue = "0") int page,
                                                                  @RequestParam(defaultValue = "10") int size,
                                                                  @RequestParam(defaultValue = "id") String sortBy,
                                                                  @RequestParam(defaultValue = "asc") String direction,Integer minPrice,Integer maxPrice)
    {

        Sort sort= direction.equalsIgnoreCase("desc")?Sort.by(sortBy).descending():Sort.by(sortBy).ascending();
        return ResponseEntity.ok(service.getAllProduct(page,size,sort,minPrice, maxPrice));
    }



    @PatchMapping("/{id}")
    public ProductResponseDto updateProduct(@PathVariable Long id, @RequestBody ProductCreateRequestDto updateDto){
        return service.updateProduct(id,updateDto);
    }


    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable Long id){
        service.deleteProduct(id);
        return "Delete Successfully";
    }
}
