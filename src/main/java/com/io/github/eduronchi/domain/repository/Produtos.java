package com.io.github.eduronchi.domain.repository;

import com.io.github.eduronchi.domain.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Produtos extends JpaRepository<Produto, Integer> {
}
