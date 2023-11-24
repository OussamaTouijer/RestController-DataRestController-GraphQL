package com.fsr.scolarite.service;

import com.fsr.scolarite.dto.EtudiantRequestDTO;
import com.fsr.scolarite.dto.EtudiantResponseDTO;
import com.fsr.scolarite.entities.Etudiant;
import com.fsr.scolarite.mapper.EtudiantInterfaceMap;
import com.fsr.scolarite.repositories.EtudiantRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
@Service

@Transactional
public class EtudiantServiceInterfaceImpl implements EtudiantServiceInterface{
    @Autowired
    EtudiantRepository etudiantRepository;

    @Autowired
    EtudiantInterfaceMap etudiantInterfaceMap;
    @Override
    public void save(EtudiantRequestDTO etudiantRequestDTO) {
        Etudiant e=new Etudiant();
        e=etudiantInterfaceMap.RequetDTO_ToEtudiant(etudiantRequestDTO);
        etudiantRepository.save(e);
    }

    @Override
    public void delete(Integer id) {
        etudiantRepository.deleteById(id);
    }

    @Override
    public void update(Integer id, EtudiantRequestDTO etudiantRequestDTO) {
      Etudiant e=etudiantRepository.findById(id).get();
      if(etudiantRequestDTO.getNom() != null) e.setNom(etudiantRequestDTO.getNom());
      if(etudiantRequestDTO.getPrenom() != null) e.setPrenom(etudiantRequestDTO.getPrenom());
      if(etudiantRequestDTO.getEmail() != null) e.setEmail(etudiantRequestDTO.getEmail());
      etudiantRepository.save(e);
    }

    @Override
    public List<EtudiantResponseDTO> getAll() {
        List<Etudiant> Liste_etudiants= new ArrayList<Etudiant>();
        Liste_etudiants=etudiantRepository.findAll();
        List<EtudiantResponseDTO> Liste_etudiantRespenseDTO=new ArrayList<EtudiantResponseDTO>();

        for (Etudiant e:Liste_etudiants)
              {
                  EtudiantResponseDTO r=etudiantInterfaceMap.ETUDIANT_ToResponseDTO(e);
                  Liste_etudiantRespenseDTO.add(r);

        }

        return Liste_etudiantRespenseDTO;
    }

    @Override
    public EtudiantResponseDTO getEtudiantById(Integer id) {
        EtudiantResponseDTO etuRespense =new EtudiantResponseDTO();
        Etudiant e=etudiantRepository.findById(id).get();
        etuRespense=etudiantInterfaceMap.ETUDIANT_ToResponseDTO(e);
        return etuRespense;
    }
}
