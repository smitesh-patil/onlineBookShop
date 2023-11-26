package com.app.bookshop.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.bookshop.pojos.Books;
import java.lang.String;
import java.util.List;
import java.util.Optional;
public interface BookDao extends JpaRepository<Books, Long> 
{
  Optional<Books> findByTitle(String title);
  List<Books> findByImagePathIsNull();
  
}
