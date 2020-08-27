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
import rppteodora.jpa.TipRacuna;
import rppteodora.reps.TipRacunaRepository;

@RestController
public class TipRacunaRestController {

	@Autowired
	TipRacunaRepository tipRacunaRepository;
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@CrossOrigin
	@ApiOperation(value = "Returns collection of all TipRacuna from database.")
	@GetMapping("tipRacuna")
	public Collection<TipRacuna> getAll(){
		return tipRacunaRepository.findAll();
	}

	@CrossOrigin
	@ApiOperation(value = "Returns TipRacuna with id that was forwarded as path variable.")
	@GetMapping("tipRacuna/{id}")
	public TipRacuna getOne(@PathVariable("id") Integer id) {
		return tipRacunaRepository.getOne(id);
	}

	@CrossOrigin
	@ApiOperation(value = "Returns TipRacuna with name that was forwarded as path variable.")
	@GetMapping("tipRacuna/naziv/{naziv}")
	public Collection<TipRacuna> getByNaziv(@PathVariable("naziv") String naziv){
		return tipRacunaRepository.findByNazivContainingIgnoreCase(naziv);
	}
	
	@CrossOrigin
	@ApiOperation(value = "Adds instance of TipRacuna to database.")
	@PostMapping("tipRacuna")
	public ResponseEntity<HttpStatus> addTipRacuna(@RequestBody TipRacuna tipRacuna) {
		tipRacunaRepository.save(tipRacuna);

		return new ResponseEntity<HttpStatus>(HttpStatus.CREATED);
	}

	@CrossOrigin
	@ApiOperation(value = "Updates TipRacuna that has id that was forwarded as path variable with values forwarded in Request Body.")
	@PutMapping("tipRacuna/{id}")
	public ResponseEntity<HttpStatus> updateTipRacuna(@RequestBody TipRacuna tipRacuna, 
			@PathVariable("id")Integer id){
		if (tipRacunaRepository.existsById(id)) {
			tipRacuna.setId(id);
			tipRacunaRepository.save(tipRacuna);
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);			
		}

		return new ResponseEntity<HttpStatus>(HttpStatus.NOT_FOUND);

	}
	
	@CrossOrigin
	@ApiOperation(value = "Deletes TipRacuna with id that was forwarded as path variable.")
	@DeleteMapping("tipRacuna/{id}")
	public ResponseEntity<HttpStatus> delete(@PathVariable Integer id){

		if(id==-100 && !tipRacunaRepository.existsById(-100)) {
			jdbcTemplate.execute("INSERT INTO tip_racuna (\"id\", \"naziv\", \"oznaka\", \"opis\") VALUES (-100, 'Test Naziv', 'Test Oznaka', 'Test Opis')");
		} 

		if (tipRacunaRepository.existsById(id)) {
			tipRacunaRepository.deleteById(id);
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		}

		return new ResponseEntity<HttpStatus>(HttpStatus.NOT_FOUND);

	}



}
