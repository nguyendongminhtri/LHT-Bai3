package com.example.demo.repository;

import com.example.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface IUserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String name); //Tim kiem User co ton tai trong DB khong?

    Boolean existsByUsername(String username); //username da ton tai tronG db roi khong cho tao

    Boolean existsByEmail(String email); // emial ton tai roi thi khong cho tao
}
