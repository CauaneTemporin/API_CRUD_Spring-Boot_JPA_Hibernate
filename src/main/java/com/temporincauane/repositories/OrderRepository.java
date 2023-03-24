package com.temporincauane.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.temporincauane.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
