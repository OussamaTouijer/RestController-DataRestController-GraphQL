package com.fsr.scolarite.service;

import com.fsr.scolarite.dto.EtudiantRequestDTO;
import com.fsr.scolarite.dto.EtudiantResponseDTO;

import java.util.List;

public interface EtudiantServiceInterface {
    public void save(EtudiantRequestDTO etudiantRequestDTO);//post ajouter un etudiant
    public void delete(Integer id);//Delete supression d'un Etudiant par id
    public void update(Integer id,EtudiantRequestDTO etudiantRequestDTO);//Put la modification les attribue(information) d'un etudiant
    public List<EtudiantResponseDTO> getAll();//Get recupere la liste de tous les etudiant
    public EtudiantResponseDTO getEtudiantById(Integer id);//Get recupere un seule etudiant par id

}
