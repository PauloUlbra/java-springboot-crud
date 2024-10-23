package com.example.AP2;


import com.example.AP2.models.Cliente;
import com.example.AP2.repositories.ClienteRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ap2Application {

	final ClienteRepository clienteRepository;

	public Ap2Application(ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(Ap2Application.class, args);
	}


}
