package com.example.shoppingcart.repository;

import com.example.shoppingcart.entity.Transaction;
import org.springframework.data.repository.CrudRepository;

public interface TransactionRepository extends CrudRepository<Transaction, Long> {
}
