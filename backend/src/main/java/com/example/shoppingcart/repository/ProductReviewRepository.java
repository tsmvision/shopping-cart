package com.example.shoppingcart.repository;

import com.example.shoppingcart.entity.ProductReview;
import org.springframework.data.repository.CrudRepository;

public interface ProductReviewRepository extends CrudRepository<ProductReview, Long> {
}
