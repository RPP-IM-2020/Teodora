package rppteodora.reps;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import rppteodora.jpa.Klijent;
import rppteodora.jpa.Racun;

public interface RacunRepository extends JpaRepository<Racun,Integer>{

	Collection<Racun> findByKlijent(Klijent k);
	
	@Query(value = "select coalesce(max(redni_broj)+1, 1) from racun where klijent = ?1", nativeQuery = true)
	Integer nextRBr(Integer klijentId);
}
