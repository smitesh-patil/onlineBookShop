package com.app.bookshop.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.bookshop.pojos.User;

public interface UserDao extends JpaRepository<User, Long> 
{
   Optional<User> findByEmailAndPassword(String email,String password);
}
