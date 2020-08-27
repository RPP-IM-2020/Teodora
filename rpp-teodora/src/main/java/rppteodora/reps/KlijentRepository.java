package rppteodora.reps;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import rppteodora.jpa.Klijent;

public interface KlijentRepository extends JpaRepository<Klijent,Integer>{
	
	Collection<Klijent> findByPrezimeContainingIgnoreCase(String naziv); 

	Collection<Klijent> findByImeContainingIgnoreCase(String naziv); 
}
