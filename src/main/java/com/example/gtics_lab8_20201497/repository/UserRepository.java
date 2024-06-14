package com.example.gtics_lab8_20201497.repository;

import com.example.gtics_lab8_20201497.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
