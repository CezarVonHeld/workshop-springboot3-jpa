package com.CezarSa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CezarSa.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
