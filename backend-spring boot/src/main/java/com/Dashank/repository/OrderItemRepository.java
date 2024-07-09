package com.Dashank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Dashank.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
