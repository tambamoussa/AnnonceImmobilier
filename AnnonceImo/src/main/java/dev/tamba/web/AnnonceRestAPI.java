package dev.tamba.web;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.tamba.DTO.AnnonceRequestDTO;
import dev.tamba.DTO.AnnonceResponseDTO;
import dev.tamba.services.AnnonceService;

@RestController
@RequestMapping(path="/api")
public class AnnonceRestAPI {
	
	private AnnonceService annonceService;

	public AnnonceRestAPI(AnnonceService annonceService) {
		super();
		this.annonceService = annonceService;
	}
	@GetMapping(path="/annonces")
	public List<AnnonceResponseDTO> allAnnonces(){
		return annonceService.listAnnonce();
	}
	
	@PostMapping(path="/annonces")
	public AnnonceResponseDTO save(AnnonceRequestDTO annonceRequestDTO) {
		return annonceService.save(annonceRequestDTO);
	}
	@GetMapping(path="/annonce{id}")
	public AnnonceResponseDTO getAnnonce(@PathVariable Long id) {
		return annonceService.getAnnonce(id);
	}


}
