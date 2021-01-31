package com.example.shoppingcart.repository;

import com.example.shoppingcart.entity.Cart;
import org.springframework.data.repository.CrudRepository;

public interface CartRepository extends CrudRepository<Cart, Long> {
}
