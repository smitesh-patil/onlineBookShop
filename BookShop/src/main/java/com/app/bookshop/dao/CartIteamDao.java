package com.app.bookshop.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.app.bookshop.pojos.CartIteam;
@Repository
public interface CartIteamDao extends JpaRepository<CartIteam, Long>{
List<CartIteam> findByMyCartId(Long cartId);
//@Modifying
//@Query("delete from CartItem c where c.myCart.id=?1")
//int deleteCartItems(long cartId);

@Modifying
@Query("delete from CartIteam c where c.myCart.id=?1")
int deleteCartItems(Long cartId);
}
