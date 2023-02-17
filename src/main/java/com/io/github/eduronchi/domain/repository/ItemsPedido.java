package com.io.github.eduronchi.domain.repository;

import com.io.github.eduronchi.domain.entity.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemsPedido extends JpaRepository <ItemPedido, Integer> {
}
