package com.io.github.eduronchi.service;

import com.io.github.eduronchi.domain.entity.Pedido;
import com.io.github.eduronchi.domain.enums.StatusPedido;
import com.io.github.eduronchi.rest.dto.PedidoDTO;

import java.util.Optional;

public interface PedidoService {
    Pedido salvar (PedidoDTO dto);
    Optional<Pedido> obterPedidoCompleto(Integer id);
    void atualizaStatus(Integer id, StatusPedido statusPedido);
}
