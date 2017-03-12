package com.example.spring.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.spring.model.Sexo;

@Repository
public interface SexoRepository extends JpaRepository<Sexo, Integer> {
	
}

