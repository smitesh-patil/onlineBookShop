package com.app.bookshop.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.bookshop.pojos.CartIteam;

public interface CartIteamDao extends JpaRepository<CartIteam, Long>{
List<CartIteam> findByMyCartId(Long cartId);
}
