package dev.tamba.DTO;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class AnnonceResponseDTO {
	
	@Id
	  private long id;
	  private String titre;
	  private String description;
	  private String lieu;
	  private String prix;
	  private String image;

}
