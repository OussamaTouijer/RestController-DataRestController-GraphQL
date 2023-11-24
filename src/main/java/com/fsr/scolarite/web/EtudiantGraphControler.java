package com.fsr.scolarite.web;

import com.fsr.scolarite.dto.EtudiantRequestDTO;
import com.fsr.scolarite.entities.Etudiant;
import com.fsr.scolarite.repositories.EtudiantRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.UUID;

@Controller
public class EtudiantGraphControler {
    @Autowired
    EtudiantRepository etudiantRepository;
    @QueryMapping
    public List<Etudiant> listerEtudiants(){return etudiantRepository.findAll();}
//    query{
//        listerEtudiants{
//            idEtudiant,
//                    nom,
//        }
//    }
@QueryMapping
public Etudiant etudiantById(@Argument Integer id){ return etudiantRepository.findById(id).get();}
//    query{
//        etudiantById(id:1){
//            idEtudiant,
//                    nom,
//        }
//    }

    @MutationMapping
    public Etudiant addEtudiant(@Argument EtudiantRequestDTO etudiant)
    {
       Etudiant r=new Etudiant();
       BeanUtils.copyProperties(etudiant,r);
       return etudiantRepository.save(r);
    }
//    mutation {
//        addEtudiant(etudiant: { nom: "hamid", prenom: "jawadi",email:"hamid@fsr.ma" }) {
//            nom
//            prenom
//            email
//        }
//    }

}
