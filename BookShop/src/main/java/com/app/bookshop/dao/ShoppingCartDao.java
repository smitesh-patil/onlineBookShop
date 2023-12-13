package com.app.bookshop.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.bookshop.pojos.ShoppingCart;

public interface ShoppingCartDao extends JpaRepository<ShoppingCart, Long>{
    Optional<ShoppingCart>findByCartOwnerId(Long userid);
    //@Query("select c from ShoppingCart c left outer join fetch c.cartItems where c.cartOwner.id=?1")
    @Query("select c from ShoppingCart c left outer join fetch c.cartItems where c.cartOwner.id=?1")
    Optional<ShoppingCart>getCartWithcartItems(Long userId);
}
