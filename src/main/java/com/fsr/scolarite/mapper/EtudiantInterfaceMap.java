package com.fsr.scolarite.mapper;

import com.fsr.scolarite.dto.EtudiantRequestDTO;
import com.fsr.scolarite.dto.EtudiantResponseDTO;
import com.fsr.scolarite.entities.Etudiant;

public interface EtudiantInterfaceMap {
    public Etudiant RequetDTO_ToEtudiant(EtudiantRequestDTO etudiantRequestDTO);
    public EtudiantResponseDTO ETUDIANT_ToResponseDTO(Etudiant etudiant);
}
