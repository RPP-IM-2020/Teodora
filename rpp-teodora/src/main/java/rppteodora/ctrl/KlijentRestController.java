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
import rppteodora.reps.KlijentRepository;

@RestController
public class KlijentRestController {
	
	@Autowired
	KlijentRepository klijentRepository;
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@CrossOrigin
	@ApiOperation(value = "Returns collection of all Klijent from database.")
	@GetMapping("klijent")
	public Collection<Klijent> getAll(){
		return klijentRepository.findAll();
	}
	
	@CrossOrigin
	@ApiOperation(value = "Returns Klijent with id that was forwarded as path variable.")
	@GetMapping("klijent/{id}")
	public Klijent getOne(@PathVariable("id") Integer id) {
		return klijentRepository.getOne(id);
	}

	@CrossOrigin
	@ApiOperation(value = "Returns Klijent with surname that was forwarded as path variable.")
	@GetMapping("klijent/prezime/{prezime}")
	public Collection<Klijent> getByPrezime(@PathVariable("prezime") String prezime){
		return klijentRepository.findByPrezimeContainingIgnoreCase(prezime);
	}
	
	@CrossOrigin
	@ApiOperation(value = "Returns Klijent with name that was forwarded as path variable.")
	@GetMapping("klijent/ime/{ime}")
	public Collection<Klijent> getByIme(@PathVariable("ime") String ime){
		return klijentRepository.findByImeContainingIgnoreCase(ime);
	}

	@CrossOrigin
	@ApiOperation(value = "Adds instance of Klijent to database.")
	@PostMapping("klijent")
	public ResponseEntity<HttpStatus> addOne(@RequestBody Klijent klijent){
		klijentRepository.save(klijent);
		return new ResponseEntity<HttpStatus>(HttpStatus.CREATED);
	}

	@CrossOrigin
	@ApiOperation(value = "Updates Klijent that has id that was forwarded as path variable with values forwarded in Request Body.")
	@PutMapping("klijent/{id}")
	public ResponseEntity<HttpStatus> update(@RequestBody Klijent klijent, @PathVariable("id") Integer id){
		if(klijentRepository.existsById(id)) {
			klijent.setId(id);
			klijentRepository.save(klijent);
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		}

		return new ResponseEntity<HttpStatus>(HttpStatus.NO_CONTENT);
	}

	@CrossOrigin
	@ApiOperation(value = "Deletes Klijent with id that was forwarded as path variable.")
	@DeleteMapping("klijent/{id}")
	public ResponseEntity<HttpStatus> delete(@PathVariable Integer id){

		if (id == -100 && !klijentRepository.existsById(-100)) {

			jdbcTemplate.execute("INSERT INTO klijent (\"id\", \"ime\", \"prezime\", \"broj_lk\", \"kredit\") "
					+ "VALUES ('-100', 'Test', 'Testic', '1000', '1')");
		}

		if(klijentRepository.existsById(id)) {
			klijentRepository.deleteById(id);
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		}

		return new ResponseEntity<HttpStatus>(HttpStatus.NO_CONTENT);

	}
}
