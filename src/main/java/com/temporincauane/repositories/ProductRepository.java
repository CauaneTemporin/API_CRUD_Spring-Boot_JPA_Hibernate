package com.temporincauane.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.temporincauane.entities.Category;
import com.temporincauane.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
