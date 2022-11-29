package com.enterprise.fullstackbackend.repository;

import com.enterprise.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
