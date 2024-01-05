package com.eccomerce.demo.dao;

import com.eccomerce.demo.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:3000")
@RepositoryRestResource(collectionResourceRel = "ProductCategory" , path = "product-category")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory ,Long> {



}
