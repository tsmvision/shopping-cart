package com.example.shoppingcart.repository;

import com.example.shoppingcart.entity.CartItem;
import org.springframework.data.repository.CrudRepository;

public interface CartItemRepository extends CrudRepository<CartItem, Long> {
}
