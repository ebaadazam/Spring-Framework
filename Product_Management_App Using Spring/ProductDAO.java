package com.ebaad.ProductManagementApp_WithSpring;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// JPARepository is a concept of ORM. It takes two arguments. first is the class you are working
// with and another is the type of the primary key

@Repository
public interface ProductDAO extends JpaRepository<Product, Integer> {

}
