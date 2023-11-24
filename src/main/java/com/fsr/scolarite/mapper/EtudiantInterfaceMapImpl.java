package com.fsr.scolarite.mapper;

import com.fasterxml.jackson.databind.util.BeanUtil;
import com.fsr.scolarite.dto.EtudiantRequestDTO;
import com.fsr.scolarite.dto.EtudiantResponseDTO;
import com.fsr.scolarite.entities.Etudiant;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class EtudiantInterfaceMapImpl implements EtudiantInterfaceMap{
    @Override
    public Etudiant RequetDTO_ToEtudiant(EtudiantRequestDTO etudiantRequestDTO) {
        Etudiant e= new Etudiant();
        BeanUtils.copyProperties(etudiantRequestDTO,e);
        return e;
    }

    @Override
    public EtudiantResponseDTO ETUDIANT_ToResponseDTO(Etudiant etudiant) {
        EtudiantResponseDTO eDTO=new EtudiantResponseDTO();
        BeanUtils.copyProperties(etudiant,eDTO);
        return eDTO;
    }
}
