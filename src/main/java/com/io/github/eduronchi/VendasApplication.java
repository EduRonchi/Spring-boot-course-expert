package com.io.github.eduronchi;

import com.io.github.eduronchi.domain.entity.Cliente;
import com.io.github.eduronchi.domain.repository.Clientes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class VendasApplication {

	@Bean
	public CommandLineRunner init(@Autowired Clientes clientes) {
		return args -> {
			System.out.println("Salvando clientes");
			clientes.save(new Cliente("Eduardo"));
			clientes.save(new Cliente("Outro Cliente"));

			boolean existe = clientes.existsByName("Eduardo");
			System.out.println("existe um cliente com o nome Eduardo ? " + existe);

		};
	}

	public static void main(String[] args) {
		SpringApplication.run(VendasApplication.class, args);
	}
}