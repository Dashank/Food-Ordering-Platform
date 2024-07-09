package com.Dashank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Dashank.model.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {


//    CartItem findByFoodIsContaining

}
