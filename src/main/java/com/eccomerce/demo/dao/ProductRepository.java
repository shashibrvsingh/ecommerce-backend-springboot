package com.eccomerce.demo.dao;

import com.eccomerce.demo.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:3000")
public interface ProductRepository extends JpaRepository<Product, Long> {
Page<Product> findByCategoryId(@Param("id") Long id , Pageable pageable);

}
