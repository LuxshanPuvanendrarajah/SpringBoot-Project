package com.qa.main.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.qa.main.domain.Squad;
import com.qa.main.services.SquadService;

@WebMvcTest
public class SquadControllerUnitTest {

@Autowired
private MockMvc mvc;

@Autowired
private ObjectMapper mapper;

@MockBean
private SquadService service;

@Test
void createTest() throws Exception {
	// Create an object for posting
	Squad entry = new Squad("harry", "kane","Forward","test2.com",29);;
	String entryAsJSON = mapper.writeValueAsString(entry);
	
	// Create an object for checking the result
	Squad result = new Squad(2L,"harry", "kane","Forward","test2.com",29);
	String resultAsJSON = mapper.writeValueAsString(result);
	
	Mockito.when(service.create(entry)).thenReturn(result);
	
	mvc.perform(post("/squad/create")
			.contentType(MediaType.APPLICATION_JSON)
			.content(entryAsJSON))
			.andExpect(content().json(resultAsJSON));
}

@Test
public void readAllTest() throws Exception {
	// Create a list to check the output of readAll
	List <Squad> result = new ArrayList<>();
	// Add the single entry to the list
	result.add(new Squad(1L,"lux","puvan","Defender","test.com",29));
	// Convert the list to JSON (The API responds in JSON)
	String resultAsJSON = mapper.writeValueAsString(result);

	Mockito.when(service.getAll()).thenReturn(result);
	
	mvc.perform(get("/squad/getAll")
			.contentType(MediaType.APPLICATION_JSON))
			.andExpect(content().json(resultAsJSON));
	
}

@Test
public void getByIdTest() throws Exception {
	
	Squad result = new Squad(1L,"lux","puvan","Defender","test.com",29);
	String resultAsJSON = mapper.writeValueAsString(result);
	
	Mockito.when(service.getByID(1)).thenReturn(result);
	
	mvc.perform(get("/squad/getByID/1")
		.contentType(MediaType.APPLICATION_JSON))
		.andExpect(status().isOk())
		.andExpect(content().json(resultAsJSON));;
}
			


@Test
public void getByFirstNameTest() throws Exception {
	List <Squad> result = new ArrayList<>();
	result.add(new Squad(1L,"lux","puvan","Defender","test.com",29));
	String resultAsJSON = mapper.writeValueAsString(result);
	
	
	Mockito.when(service.getByFirstName("lux")).thenReturn(result);
	
	mvc.perform(get("/squad/getByFirstName/lux")
			.contentType(MediaType.APPLICATION_JSON))
			.andExpect(status().isOk());

}
@Test
public void getByLastNameTest() throws Exception {
	
	List <Squad> result = new ArrayList<>();
	result.add(new Squad(1L,"lux","puvan","Defender","test.com",29));
	String resultAsJSON = mapper.writeValueAsString(result);
	
	
	Mockito.when(service.getByLastName("puvan")).thenReturn(result);

	mvc.perform(get("/squad/getByLastName/puvan")
			.contentType(MediaType.APPLICATION_JSON))
			.andExpect(status().isOk());
			
}



@Test
public void updateTest() throws Exception {
	
	Squad update = new Squad(1L,"harry","puvan","Defender","test.com",29);
	String updateJSON =	mapper.writeValueAsString(update);
	
	Squad result = new Squad(1L,"harry","puvan","Defender","test.com",29);
	String resultAsJSON = mapper.writeValueAsString(result);
	
	Mockito.when(service.updateById(1,update)).thenReturn(result);
	
	mvc.perform(put("/squad/update/1")
			.contentType(MediaType.APPLICATION_JSON)
			.content(updateJSON))
			.andExpect(content().json(resultAsJSON));
	
}

@Test
public void deleteTest() throws Exception {
	
	Mockito.when(service.deleteById(1)).thenReturn(true);
	
	mvc.perform(delete("/squad/delete/1")
			.contentType(MediaType.APPLICATION_JSON))
			.andExpect(status().isNoContent());
}


}