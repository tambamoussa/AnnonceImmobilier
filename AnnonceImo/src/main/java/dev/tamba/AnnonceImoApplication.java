package dev.tamba;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import dev.tamba.DTO.AnnonceRequestDTO;
import dev.tamba.services.AnnonceService;



@SpringBootApplication
public class AnnonceImoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnnonceImoApplication.class, args);
	}
	
	@Bean
	CommandLineRunner start(AnnonceService annonceService) {
		return args->{
			
			annonceService.save(new AnnonceRequestDTO());
			
		};
	}
	
	
		
	

}
