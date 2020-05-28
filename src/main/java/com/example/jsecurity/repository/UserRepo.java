package com.example.jsecurity.repository;

import com.example.jsecurity.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, Long> {
    User findByUsername(String name);
}
