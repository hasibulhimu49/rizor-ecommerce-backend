package com.business.rizor_ecommerce_api.cart.repository;

import com.business.rizor_ecommerce_api.cart.entity.Cart;
import com.business.rizor_ecommerce_api.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart,Long> {

    Cart findByUser(User user);

}
