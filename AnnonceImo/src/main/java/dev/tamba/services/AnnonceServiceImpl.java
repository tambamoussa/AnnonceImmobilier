package dev.tamba.services;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import dev.tamba.DTO.AnnonceRequestDTO;
import dev.tamba.DTO.AnnonceResponseDTO;
import dev.tamba.Repositories.AnnonceRepository;
import dev.tamba.entities.Annonce;
import dev.tamba.mappers.AnnonceMapper;
@Service
@Transactional
public class AnnonceServiceImpl implements AnnonceService {
	private AnnonceRepository annonceRepository;

	public AnnonceServiceImpl(AnnonceRepository annonceRepository) {
		super();
		this.annonceRepository = annonceRepository;
	}
	private AnnonceMapper annonceMapper;



	public AnnonceServiceImpl(AnnonceMapper annonceMapper) {
		super();
		this.annonceMapper = annonceMapper;
	}

	@Override
	public AnnonceResponseDTO save(AnnonceRequestDTO annonceRequestDTO) {
		Annonce annonce=annonceMapper.annonceRequestDTOAnnonce(annonceRequestDTO);
		Annonce saveAnnonce=annonceRepository.save(annonce);
		
		AnnonceResponseDTO annonceResponseDTO=annonceMapper.annoceToannonceResponseDTO(saveAnnonce);
		return annonceResponseDTO;

	}

	@Override
	public AnnonceResponseDTO getAnnonce(Long id) {
		Annonce annonce=annonceRepository.findById(id).get();
		return annonceMapper.annoceToannonceResponseDTO(annonce);
	}

	@Override
	public AnnonceResponseDTO update(AnnonceRequestDTO annonceRequestDTO) {
		Annonce annonce=annonceMapper.annonceRequestDTOAnnonce(annonceRequestDTO);
		Annonce updateannonce=annonceRepository.save(annonce);
		return annonceMapper.annoceToannonceResponseDTO(updateannonce);
	}

	@Override
	public List<AnnonceResponseDTO> listAnnonce() {
		List<Annonce> annonce=annonceRepository.findAll();
		List<AnnonceResponseDTO> annonceResponseDTOS=annonce.stream()
				.map(anno->annonceMapper.annoceToannonceResponseDTO(anno))
				.collect(Collectors.toList());
	
		return annonceResponseDTOS;
	}

}
