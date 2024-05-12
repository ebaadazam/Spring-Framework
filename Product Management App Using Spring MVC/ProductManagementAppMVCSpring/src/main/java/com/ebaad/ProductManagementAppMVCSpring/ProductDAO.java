package com.ebaad.ProductManagementAppMVCSpring;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// JPARepository is a concept of ORM. It takes two arguments. first is the class you are working
// with and another is the type of the primary key
// Using JPARepository, we can perform SQL Operations without having to worry about writing the code
// We can do CRUD operations using this

@Repository
public interface ProductDAO extends JpaRepository<Product, Integer> {
	
	// If you want to fetch from a particular column not from the primary key
	Product findByName(String name); 

}
