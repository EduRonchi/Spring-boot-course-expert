package com.io.github.eduronchi.rest.dto;

import com.io.github.eduronchi.validation.NotEmptyList;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PedidoDTO {

    @NotNull(message = "Informe o código do cliente.")
    private Integer cliente;

    @NotNull(message = "Campo Total do pedido é obrigatório.")
    private BigDecimal total;

    @NotEmptyList(message = "Pedido não pode ser realizado sem itens.")
    private List<ItemPedidoDTO> items;

}
