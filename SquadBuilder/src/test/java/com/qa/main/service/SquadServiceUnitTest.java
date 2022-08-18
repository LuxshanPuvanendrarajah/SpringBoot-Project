package com.qa.main.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.qa.main.domain.Squad;
import com.qa.main.repo.SquadRepo;
import com.qa.main.services.SquadService;


@SpringBootTest
public class SquadServiceUnitTest {
	
@Autowired
private SquadService  service;

@MockBean
private SquadRepo repo;


@Test
public void testCreate() {
	Squad entry = new Squad("harry","kane","Forward","test.com",29);
	Squad result = new Squad(2L,"harry","kane","Forward","test.com",29);
	Mockito.when(repo.saveAndFlush(entry)).thenReturn(result);
	assertEquals(result,service.create(entry));
}
	
@Test
public void testGetAll() {
		
	List <Squad> result = new ArrayList<>();
		
		result.add(new Squad(1L,"lux","puvan","Defender","test.com",29));
		
		Mockito.when(repo.findAll()).thenReturn(result);
		
		assertEquals(result,service.getAll());

		}
@Test
	public void testGetByID(){
	Squad result =new Squad( 1L,"lux","puvan","Defender","test.com",29);
	Optional<Squad> result1 = Optional.ofNullable(result);
	Mockito.when(repo.findById(1L)).thenReturn(result1);
	assertEquals(result, service.getByID(1L));
	
		}
@Test
	public void testGetByFirstName(){
		List <Squad> result = new ArrayList<>();
		
		result.add(new Squad(1L,"lux","puvan","Defender","test.com",29));
		
		Mockito.when(repo.findPlayerByFirstName("lux")).thenReturn(result);
		
		assertEquals(result,service.getByFirstName("lux"));
	}
@Test
	public void testGetByLastName(){
		List <Squad> result = new ArrayList<>();
		
		result.add(new Squad(1L,"lux","puvan","Defender","test.com",29));
		
		Mockito.when(repo.findPlayerByLastName("puvan")).thenReturn(result);
		
		assertEquals(result,service.getByLastName("puvan"));
	}
	

	//put request-update
@Test
	public void updateById() {
		Squad result =new Squad( 1L,"lux","puvan","Defender","test.com",29);
		Optional<Squad> result1 = Optional.ofNullable(result);
		Mockito.when(repo.findById(1L)).thenReturn(result1);
		Mockito.when(repo.saveAndFlush(result)).thenReturn(result);
		assertEquals(result, service.updateById(1L,result));
	}
	
	//delete request - delete
@Test
	public void deleteById() {
		 Mockito.when(repo.existsById(1L)).thenReturn(false);

	        assertEquals(true, service.deleteById(1L));
	
	}
	
}


;