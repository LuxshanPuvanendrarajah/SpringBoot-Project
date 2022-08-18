package com.qa.main.services;

import java.util.List;

import org.springframework.stereotype.Service;
import com.qa.main.domain.Squad;
import com.qa.main.exceptions.SquadNotFoundException;
import com.qa.main.repo.SquadRepo;

@Service
public class SquadService {
		private SquadRepo repo;
		public SquadService(SquadRepo repo) {
			this.repo = repo;
		}
		
		//post request - create
		public Squad create( Squad player) {
			return repo.saveAndFlush(player);
		}
		
		
		public  List<Squad> getAll() {
			return repo.findAll();
		}
		
		public Squad getByID(long id){
			return repo.findById(id).orElseThrow(SquadNotFoundException::new);
			}
		public List<Squad> getByFirstName(String firstName){
			return repo.findPlayerByFirstName(firstName);
		}
		public List<Squad> getByLastName(String lastName){
			return repo.findPlayerByLastName(lastName);}
		
		//put request-update
		public Squad updateById(long id, Squad newplayer) {
			Squad existing = repo.findById(id).get();
			
			existing.setLink(newplayer.getLink());
			existing.setPosition(newplayer.getPosition());
			existing.setFirstName(newplayer.getFirstName());
			existing.setLastName(newplayer.getLastName());
			existing.setAge(newplayer.getAge());
			
			return repo.saveAndFlush(existing);
		}
		
		//delete request - delete
		
		public boolean deleteById(long id) {
			repo.deleteById(id);
			// ! flips the boolean to true so we cann code in javascript
			return !repo.existsById(id);
		}
		


}


