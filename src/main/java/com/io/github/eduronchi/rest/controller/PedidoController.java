package com.io.github.eduronchi.rest.controller;

import com.io.github.eduronchi.domain.entity.Pedido;
import com.io.github.eduronchi.service.PedidoService;
import com.io.github.eduronchi.rest.dto.PedidoDTO;
import org.springframework.web.bind.annotation.*;
import static org.springframework.http.HttpStatus.*;

@RestController
@RequestMapping("/api/pedidos")
public class PedidoController {

    private PedidoService service;

    public PedidoController(PedidoService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseStatus(CREATED)
    public Integer save(@RequestBody PedidoDTO dto){
        Pedido pedido = service.salvar(dto);
        return pedido.getId();
    }
}
