package com.CezarSa.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.CezarSa.course.entities.Order;
import com.CezarSa.course.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll(){
		return repository.findAll();
	}
	
	public Order findByid(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
}
