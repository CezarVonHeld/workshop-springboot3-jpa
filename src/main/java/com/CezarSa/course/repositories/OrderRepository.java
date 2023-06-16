package com.CezarSa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CezarSa.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
