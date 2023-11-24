package com.fsr.scolarite.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data @Getter @NoArgsConstructor @AllArgsConstructor @ToString @Builder @Setter
public class Etudiant {
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idEtudiant;
    private String nom;
    private String prenom;
    private String email;
}
