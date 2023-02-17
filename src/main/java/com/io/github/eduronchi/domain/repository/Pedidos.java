package com.io.github.eduronchi.domain.repository;

import com.io.github.eduronchi.domain.entity.Cliente;
import com.io.github.eduronchi.domain.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Pedidos extends JpaRepository<com.io.github.eduronchi.domain.entity.Pedido, Integer> {

    List<Pedido> findByCliente(Cliente cliente);
}
