package com.business.rizor_ecommerce_api.cart.service;

import com.business.rizor_ecommerce_api.cart.entity.Cart;
import com.business.rizor_ecommerce_api.cart.entity.CartItem;
import com.business.rizor_ecommerce_api.cart.repository.CartItemRepository;
import com.business.rizor_ecommerce_api.cart.repository.CartRepository;
import com.business.rizor_ecommerce_api.common.exception.ResourceNotFoundException;
import com.business.rizor_ecommerce_api.product.entity.Product;
import com.business.rizor_ecommerce_api.product.repository.ProductRepository;
import com.business.rizor_ecommerce_api.user.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CartService {


    private final CartRepository cartRepository;
    private final CartItemRepository cartItemRepository;
    private final ProductRepository productRepository;
    private final User user;


    private CartItem createCartItem(Long productId, Integer quantity){
        Product product=productRepository.findById(productId).orElseThrow(()->new ResourceNotFoundException("Product Not available"));

        Cart cart=cartRepository.findByUser(user);

        CartItem cartItem=new CartItem();
        cartItem.setCart(cart);
        cartItem.setProduct(product);
        cartItem.setQuantity(quantity);
        cartItem.setPrice(product.getPrice());
        cartItem.setSubTotal(product.getPrice()*quantity);

        return cartItemRepository.save(cartItem);
    }



    public Cart getCartByUser() {

        Cart cart = cartRepository.findByUser(user);

        if (cart == null) {
            throw new ResourceNotFoundException("Cart not found");
        }

        return cart;
    }


}
