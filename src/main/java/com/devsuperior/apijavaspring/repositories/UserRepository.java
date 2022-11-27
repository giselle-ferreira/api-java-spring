package com.devsuperior.apijavaspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.apijavaspring.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
