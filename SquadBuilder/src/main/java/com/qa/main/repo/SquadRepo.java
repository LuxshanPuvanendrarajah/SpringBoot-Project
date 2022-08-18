package com.qa.main.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.main.domain.Squad;

@Repository
public interface SquadRepo extends JpaRepository<Squad,Long>{
	//Select * From Customer where first_name 
	List<Squad> findPlayerByFirstName(String firstName);
	List<Squad> findPlayerByLastName(String lastName);
	
}
