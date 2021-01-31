package com.example.shoppingcart.repository;

import com.example.shoppingcart.entity.OrderItem;
import org.springframework.data.repository.CrudRepository;

public interface OrderItemRepository extends CrudRepository<OrderItem, Long> {
}
