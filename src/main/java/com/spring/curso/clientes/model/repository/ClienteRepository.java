package com.spring.curso.clientes.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.curso.clientes.model.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{
	
	

}
