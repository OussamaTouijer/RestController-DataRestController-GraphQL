package com.fsr.scolarite.web;

import com.fsr.scolarite.dto.EtudiantRequestDTO;
import com.fsr.scolarite.dto.EtudiantResponseDTO;
import com.fsr.scolarite.repositories.EtudiantRepository;
import com.fsr.scolarite.service.EtudiantServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api")


@org.springframework.web.bind.annotation.RestController

public class RestController {
    @Autowired
    EtudiantRepository etudiantRepository;

    @Autowired
    EtudiantServiceInterface etudiantServiceInterface;

    @GetMapping("/etudiants")
    public List<EtudiantResponseDTO> getAll(){
        return etudiantServiceInterface.getAll();
    }

    @GetMapping("/etudiants/{id}")
    public EtudiantResponseDTO getEtudiantById(@PathVariable Integer id){
        return etudiantServiceInterface.getEtudiantById(id);
    }

    @PostMapping("/etudiants")
    public void save(@RequestBody EtudiantRequestDTO e){
        etudiantServiceInterface.save(e);
    }

    @PutMapping("/etudiants/{id}")
    public void update(@PathVariable("id") Integer id,@RequestBody EtudiantRequestDTO e){
           etudiantServiceInterface.update(id,e);
    }

    @DeleteMapping("/etudiants/{id}")
    public void delete(@PathVariable("id") Integer id) {
        etudiantServiceInterface.delete(id);
    }

    @GetMapping("/tests")
    public String sayHi(){
        return "hello";
    }
}
