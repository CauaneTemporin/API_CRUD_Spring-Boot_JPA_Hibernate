package com.temporincauane.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.temporincauane.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
