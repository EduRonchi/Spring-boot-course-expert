package com.io.github.eduronchi;

import com.io.github.eduronchi.domain.entity.Cliente;
import com.io.github.eduronchi.domain.repository.Clientes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class VendasApplication {

	@Bean
	public CommandLineRunner init(@Autowired Clientes clientes){
		return args -> {
			System.out.println("Salvando clientes");
			clientes.salvar(new Cliente("Eduardo"));
			clientes.salvar(new Cliente("Outro Cliente"));

			List<Cliente> todosClientes = clientes.obterTodos();
			todosClientes.forEach(System.out::println);

		System.out.println("Atualizando clientes");
		todosClientes.forEach(c -> {
			c.setName(c.getName() + " atualizado.");
			clientes.atualizar(c);
		});

		todosClientes = clientes.obterTodos();
		todosClientes.forEach(System.out::println);

		System.out.println("Buscando clientes");
		clientes.buscarPorName("Cli").forEach(System.out::println);

            System.out.println("deletando clientes");
            clientes.obterTodos().forEach(c -> {
                clientes.deletar(c);
            });

		todosClientes = clientes.obterTodos();
		if(todosClientes.isEmpty()){
			System.out.println("Nenhum cliente encontrado.");
		}else{
			todosClientes.forEach(System.out::println);
			}
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(VendasApplication.class, args);
	}
}