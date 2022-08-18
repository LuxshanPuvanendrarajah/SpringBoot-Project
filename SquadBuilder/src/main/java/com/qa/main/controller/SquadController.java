package com.qa.main.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.main.domain.Squad;
import com.qa.main.services.SquadService;

@RestController
@CrossOrigin
@RequestMapping("/squad")
public class SquadController {
	
	private SquadService service;
	
	public SquadController(SquadService service) {
		super();
		this.service = service;
		
	}
	
	
	//post request - create
	
	@PostMapping("/create")
	public ResponseEntity<Squad> create(@RequestBody Squad player) {
		return new ResponseEntity<Squad>(service.create(player),HttpStatus.CREATED);
	}
	
	//get request- read
	@GetMapping("/getAll")
	public  ResponseEntity<List<Squad>> getAll() {
		return new ResponseEntity<List<Squad>>(service.getAll(),HttpStatus.OK);}//ok
	
	@GetMapping("/getByID/{id}")
	public ResponseEntity<Squad> getByID(@PathVariable ("id") Long id){
	return new ResponseEntity<Squad>(service.getByID(id),HttpStatus.OK);		
	}
	//from customer repo find by query
	@GetMapping("/getByFirstName/{firstName}")
	public ResponseEntity<List<Squad>>getByFirstName(@PathVariable String firstName){
		return new ResponseEntity <List<Squad>>( service.getByFirstName(firstName),HttpStatus.OK);
	}
	
	//from customer repo find by query
		@GetMapping("/getByLastName/{lastName}")
		public ResponseEntity<List<Squad>>getByLastName(@PathVariable String lastName){
			return new ResponseEntity <List<Squad>>( service.getByLastName(lastName),HttpStatus.OK);
		}
	
	//put request-update
	@PutMapping("/update/{id}")
	public ResponseEntity<Squad>updateById(@PathVariable ("id")Long id,@RequestBody Squad player) {
	return new ResponseEntity<Squad>(service.updateById(id,player),HttpStatus.ACCEPTED);
	}

	//delete request - delet
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Boolean> deleteById(@PathVariable ("id") Long id) {
		return new ResponseEntity<Boolean>(service.deleteById(id),HttpStatus.NO_CONTENT);
	}
	

}
