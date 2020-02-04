package br.com.gx2.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.gx2.entities.User;
import br.com.gx2.repositories.UserRepository;

@Configuration
@Profile("test")

public class TestConfig implements CommandLineRunner{

	@Autowired
	private UserRepository repository;

	//Tudo que for adicionado dentro do método será executado quando a aplicação subir
	@Override
	public void run(String... args) throws Exception {
		
	
	}
	
	
}
