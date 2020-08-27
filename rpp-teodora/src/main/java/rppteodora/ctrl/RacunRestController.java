package rppteodora.ctrl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import rppteodora.jpa.Klijent;
import rppteodora.jpa.Racun;
import rppteodora.reps.KlijentRepository;
import rppteodora.reps.RacunRepository;

@RestController
public class RacunRestController {
	
	@Autowired
	RacunRepository racunRepository;
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private KlijentRepository klijentRepository;
	
	@CrossOrigin
	@ApiOperation(value = "Returns collection of all Racun from database.")
	@GetMapping("racun")
	public Collection<Racun> getAll(){
		return racunRepository.findAll();
	}

	@CrossOrigin
	@ApiOperation(value = "Returns Racun with id that was forwarded as path variable.")
	@GetMapping("racun/{id}")
	public Racun getOne(@PathVariable("id") Integer id) {
		return racunRepository.getOne(id);
	}

	@CrossOrigin
	@ApiOperation(value = "Returns collection of Racun for Klijent with id that was forwarded as path variable.")
	@GetMapping("racunZaKlijenta/{id}")
	public Collection<Racun> getAllForKlijent(@PathVariable("id") Integer id){
		Klijent k = klijentRepository.getOne(id);
		return racunRepository.findByKlijent(k);

	}
	
	@CrossOrigin
	@ApiOperation(value = "Adds instance of Racun to database.")
	@PostMapping("racun")
	public ResponseEntity<HttpStatus> addRacun(@RequestBody Racun racun) {
		racunRepository.save(racun);

		return new ResponseEntity<HttpStatus>(HttpStatus.CREATED);
	}

	@CrossOrigin
	@ApiOperation(value = "Updates Racun that has id that was forwarded as path variable with values forwarded in Request Body.")
	@PutMapping("racun/{id}")
	public ResponseEntity<HttpStatus> updateOne(@RequestBody Racun racun, @PathVariable("id") Integer id){
		if (!racunRepository.existsById(id)) {
			return new ResponseEntity<HttpStatus>(HttpStatus.NO_CONTENT);
		}
		racun.setId(id);
		racunRepository.save(racun);
		return new ResponseEntity<HttpStatus>(HttpStatus.OK);
	}
	
	@CrossOrigin
	@ApiOperation(value = "Deletes Racun with id that was forwarded as path variable.")
	@DeleteMapping("racun/{id}")
	public ResponseEntity<HttpStatus> delete(@PathVariable Integer id){

		if(id==-100 && !racunRepository.existsById(-100)) {
			jdbcTemplate.execute("INSERT INTO racun (\"id\", \"naziv\", \"oznaka\", \"opis\",\"tip_racuna\",\"klijent\") VALUES (-100, 'Test Naziv', 'Test Oznaka', 'Test Opis', '1','1')");
		} 

		if (racunRepository.existsById(id)) {
			racunRepository.deleteById(id);
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		}

		return new ResponseEntity<HttpStatus>(HttpStatus.NOT_FOUND);

	}
	
	
}
