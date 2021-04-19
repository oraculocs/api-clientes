package com.spring.curso.clientes.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.curso.clientes.model.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

}
