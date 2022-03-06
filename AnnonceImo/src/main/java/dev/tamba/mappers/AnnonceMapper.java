package dev.tamba.mappers;

import org.mapstruct.Mapper;

import dev.tamba.DTO.AnnonceRequestDTO;
import dev.tamba.DTO.AnnonceResponseDTO;
import dev.tamba.entities.Annonce;

@Mapper(componentModel="spring")
public interface AnnonceMapper {
	
	AnnonceResponseDTO annoceToannonceResponseDTO(Annonce annonce);
	Annonce annonceRequestDTOAnnonce(AnnonceRequestDTO annonceRequestDTO);

}
