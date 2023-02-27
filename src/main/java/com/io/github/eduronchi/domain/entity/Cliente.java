package com.io.github.eduronchi.domain.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;
import org.hibernate.validator.constraints.br.CPF;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name", length = 100)
    @NotEmpty(message = "Campo name é obrigatório.")
    private String name;

    @Column(name = "cpf", length = 11)
    @NotEmpty(message = "Campo CPF é obrigatório.")
    @CPF(message = "Informe um CPF válido.")
    private String cpf;

    @JsonIgnore
    @OneToMany(mappedBy = "cliente" , fetch = FetchType.LAZY)
    private Set<Pedido> pedidos;

    public Cliente(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

}