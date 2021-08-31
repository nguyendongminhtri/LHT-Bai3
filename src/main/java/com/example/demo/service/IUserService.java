package com.example.demo.service;

import com.example.demo.model.User;

import java.util.Optional;

public interface IUserService {
    Optional<User> findByUsername(String name); //Tim kiem User co ton tai trong DB khong?

    Boolean existsByUsername(String username); //username da ton tai tronG db roi khong cho tao

    Boolean existsByEmail(String email); // emial ton tai roi thi khong cho tao
    User save(User user);
}
