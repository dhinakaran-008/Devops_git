package com.demo2.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo2.demo.domain.User;
@Repository
public interface UserRepository extends JpaRepository<User,String> {
User findByUsernameAndPassowrd(String username,String password);
}
