package ecole.suptech.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ecole.suptech.entities.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant, Long>{

}
