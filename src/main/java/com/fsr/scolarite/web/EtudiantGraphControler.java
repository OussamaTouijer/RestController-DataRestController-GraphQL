package com.fsr.scolarite.web;

import com.fsr.scolarite.dto.EtudiantRequestDTO;
import com.fsr.scolarite.dto.EtudiantResponseDTO;
import com.fsr.scolarite.entities.Etudiant;
import com.fsr.scolarite.repositories.EtudiantRepository;
import com.fsr.scolarite.service.EtudiantServiceInterface;
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
    @Autowired
    EtudiantServiceInterface etudiantServiceInterface;
    @QueryMapping
    public List<EtudiantResponseDTO> getAll(){return etudiantServiceInterface.getAll();}
//    query{
//        getAll{
//            idEtudiant,
//                    nom,
//        }
//    }
@QueryMapping
public EtudiantResponseDTO getEtudiantById(@Argument Integer id){ return etudiantServiceInterface.getEtudiantById(id);}
//    query{
//        getEtudiantById(id:1){
//            idEtudiant,
//                    nom,
//        }
//    }

    @MutationMapping
    public void save(@Argument EtudiantRequestDTO etudiant)
    {
     etudiantServiceInterface.save(etudiant);
    }
//    mutation {
//        save(etudiant: { nom: "hamid", prenom: "jawadi",email:"hamid@fsr.ma" }) {
//            nom
//            prenom
//            email
//        }
//    }

    @MutationMapping
    public void delete(@Argument Integer id  )
    {
        etudiantServiceInterface.delete(id);

    }
//    mutation {
//        delete(id:1){
//            nom
//        }
//    }

    @MutationMapping
    public void update(@Argument Integer id ,@Argument EtudiantRequestDTO input) {
        etudiantServiceInterface.update(id, input);
    }

//    mutation {
//        update(id: 4, input: { nom: "zina", prenom: "balghiti", email: "zina@fsr.com" }) {
//            nom
//            prenom
//            email
//        }
//    }


}
