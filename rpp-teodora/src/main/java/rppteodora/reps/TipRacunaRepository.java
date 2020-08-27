package rppteodora.reps;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import rppteodora.jpa.TipRacuna;

public interface TipRacunaRepository extends JpaRepository<TipRacuna,Integer> {

	Collection<TipRacuna> findByNazivContainingIgnoreCase(String naziv); 
}
