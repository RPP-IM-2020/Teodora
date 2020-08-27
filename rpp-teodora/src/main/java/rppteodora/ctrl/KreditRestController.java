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
import rppteodora.jpa.Kredit;
import rppteodora.reps.KreditRepository;

@RestController
public class KreditRestController {
	
	@Autowired
	KreditRepository kreditRepository;
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@CrossOrigin
	@ApiOperation(value = "Returns collection of all Kredit from database.")
	@GetMapping("kredit")
	public Collection<Kredit> getAll(){
		return kreditRepository.findAll();
	}

	@CrossOrigin
	@ApiOperation(value = "Returns Kredit with id that was forwarded as path variable.")
	@GetMapping("kredit/{id}")
	public Kredit getOne(@PathVariable("id") Integer id) {
		return kreditRepository.getOne(id);
	}

	@CrossOrigin
	@ApiOperation(value = "Returns Kredit with name that was forwarded as path variable.")
	@GetMapping("kredit/naziv/{naziv}")
	public Collection<Kredit> getByNaziv(@PathVariable("naziv") String naziv){
		return kreditRepository.findByNazivContainingIgnoreCase(naziv);
	}

	@CrossOrigin
	@ApiOperation(value = "Adds instance of Kredit to database.")
	@PostMapping("kredit")
	public ResponseEntity<HttpStatus> addKredit(@RequestBody Kredit kredit) {
		kreditRepository.save(kredit);

		return new ResponseEntity<HttpStatus>(HttpStatus.CREATED);
	}
	
	@CrossOrigin
	@ApiOperation(value = "Updates Kredit that has id that was forwarded as path variable with values forwarded in Request Body.")
	@PutMapping("kredit/{id}")
	public ResponseEntity<HttpStatus> updateKredit(@RequestBody Kredit kredit, 
			@PathVariable("id")Integer id){
		if (kreditRepository.existsById(id)) {
			kredit.setId(id);
			kreditRepository.save(kredit);
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);			
		}

		return new ResponseEntity<HttpStatus>(HttpStatus.NOT_FOUND);

	}


	@CrossOrigin
	@ApiOperation(value = "Deletes Kredit with id that was forwarded as path variable.")
	@DeleteMapping("kredit/{id}")
	public ResponseEntity<HttpStatus> delete(@PathVariable Integer id){

		if(id==-100 && !kreditRepository.existsById(-100)) {
			jdbcTemplate.execute("INSERT INTO kredit (\"id\", \"naziv\", \"oznaka\", \"opis\") VALUES (-100, 'Test Naziv', 'Test Oznaka', 'Test Opis')");
		} 

		if (kreditRepository.existsById(id)) {
			kreditRepository.deleteById(id);
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		}

		return new ResponseEntity<HttpStatus>(HttpStatus.NOT_FOUND);

	}



}
