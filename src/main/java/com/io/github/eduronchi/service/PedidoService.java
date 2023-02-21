package com.io.github.eduronchi.service;

import com.io.github.eduronchi.domain.entity.Pedido;
import com.io.github.eduronchi.rest.dto.PedidoDTO;

public interface PedidoService {
    Pedido salvar (PedidoDTO dto);
}
