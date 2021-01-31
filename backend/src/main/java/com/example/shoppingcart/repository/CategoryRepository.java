package com.example.shoppingcart.repository;

import com.example.shoppingcart.entity.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
