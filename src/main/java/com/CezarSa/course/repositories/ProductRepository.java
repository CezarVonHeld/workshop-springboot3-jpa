package com.CezarSa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CezarSa.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
