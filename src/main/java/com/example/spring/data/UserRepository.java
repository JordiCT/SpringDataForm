package com.example.spring.data;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.spring.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	ArrayList<User> findAll();
	
}

