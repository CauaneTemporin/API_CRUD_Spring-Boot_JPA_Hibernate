package com.temporincauane.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.temporincauane.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
