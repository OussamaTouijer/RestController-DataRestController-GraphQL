package com.fsr.scolarite.repositories;

import com.fsr.scolarite.entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestController
public interface EtudiantRepository extends JpaRepository<Etudiant,Integer> {

}
