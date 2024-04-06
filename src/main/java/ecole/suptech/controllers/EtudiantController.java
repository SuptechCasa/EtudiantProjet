package ecole.suptech.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ecole.suptech.entities.Etudiant;
import ecole.suptech.repositories.EtudiantRepository;

@RestController
@RequestMapping("ecole")
@CrossOrigin(origins = "*")
public class EtudiantController {
	@Autowired EtudiantRepository etudiantRepository;
@GetMapping("etudiants")
public List<Etudiant> getallEtudiants(){
	return etudiantRepository.findAll();
}
@PostMapping("etudiants")
public Etudiant addEtudiant(@RequestBody Etudiant etudiant) {
	return etudiantRepository.save(etudiant);
}
@DeleteMapping("etudiants/{id}")
public boolean deleteEtudiant(@PathVariable Long id) {
	etudiantRepository.deleteById(id);
	return !etudiantRepository.existsById(id);
}
}
