package com.temporincauane.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.temporincauane.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
