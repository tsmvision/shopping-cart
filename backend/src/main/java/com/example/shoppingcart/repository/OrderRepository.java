package com.example.shoppingcart.repository;

import com.example.shoppingcart.entity.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
