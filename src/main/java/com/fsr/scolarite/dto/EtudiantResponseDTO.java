package com.fsr.scolarite.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data @Getter @NoArgsConstructor @AllArgsConstructor @ToString @Builder @Setter
public class EtudiantResponseDTO {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEtudiant;
    private String nom;
    private String prenom;
    private String email;
}
