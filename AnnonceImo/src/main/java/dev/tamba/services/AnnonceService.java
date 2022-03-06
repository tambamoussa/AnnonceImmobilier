package dev.tamba.services;

import java.util.List;

import dev.tamba.DTO.AnnonceRequestDTO;
import dev.tamba.DTO.AnnonceResponseDTO;

public interface AnnonceService {
	
	 AnnonceResponseDTO save(AnnonceRequestDTO annonceRequestDTO);
	 AnnonceResponseDTO getAnnonce(Long id);
	 AnnonceResponseDTO update(AnnonceRequestDTO annonceRequestDTO);
	 List<AnnonceResponseDTO> listAnnonce();

}
