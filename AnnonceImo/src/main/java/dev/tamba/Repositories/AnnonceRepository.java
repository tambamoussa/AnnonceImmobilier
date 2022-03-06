package dev.tamba.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.tamba.entities.Annonce;

public interface AnnonceRepository extends JpaRepository<Annonce,Long>{

}
