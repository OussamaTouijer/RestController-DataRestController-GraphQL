package com.fsr.scolarite;

import com.fsr.scolarite.entities.Etudiant;
import com.fsr.scolarite.repositories.EtudiantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScolariteApplication implements CommandLineRunner {
	@Autowired
	EtudiantRepository etudiantRepository;

	public static void main(String[] args) {
		SpringApplication.run(ScolariteApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		etudiantRepository.save(new Etudiant(null,"wydad","emarat","wydad@fsr.ac.ma"));
		etudiantRepository.save(new Etudiant(null,"oussama","touijer","oussama@fsr.ac.ma"));
		etudiantRepository.save(new Etudiant(null,"naima","mct","naima@fsr.ac.ma"));
		etudiantRepository.save(new Etudiant(null,"soufian","moussa","soufian@fsr.ac.ma"));
		etudiantRepository.save(new Etudiant(null,"mohammed","Eloutassi","mohammed@fsr.ac.ma"));
	}
}
