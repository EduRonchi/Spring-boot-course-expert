package com.io.github.eduronchi.domain.repository;

import com.io.github.eduronchi.domain.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Clientes extends JpaRepository <Cliente, Integer> {

   List<Cliente> findByNameLike(String name);

   boolean existsByName(String name);



}