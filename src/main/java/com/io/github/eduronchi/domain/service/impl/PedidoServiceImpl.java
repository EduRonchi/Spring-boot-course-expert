package com.io.github.eduronchi.domain.service.impl;

import com.io.github.eduronchi.domain.repository.Pedidos;
import com.io.github.eduronchi.domain.service.PedidoService;
import org.springframework.stereotype.Service;

@Service
public class PedidoServiceImpl implements PedidoService {

    private Pedidos repository;

    public PedidoServiceImpl(Pedidos repository) {
        this.repository = repository;
    }
}
