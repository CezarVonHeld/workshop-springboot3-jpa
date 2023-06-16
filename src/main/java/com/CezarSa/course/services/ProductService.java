package com.CezarSa.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CezarSa.course.entities.Product;
import com.CezarSa.course.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll(){
		return repository.findAll();
	}
	
	public Product findByid(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
}
