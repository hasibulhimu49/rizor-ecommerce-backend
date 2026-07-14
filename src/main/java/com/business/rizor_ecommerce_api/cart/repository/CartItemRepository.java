package com.business.rizor_ecommerce_api.cart.repository;

import com.business.rizor_ecommerce_api.cart.entity.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepository extends JpaRepository<CartItem,Long> {
}
