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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.Sql.ExecutionPhase;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.qa.main.domain.Squad;

@SpringBootTest
@AutoConfigureMockMvc
@Sql(scripts= {"classpath:testschema.sql","classpath:testdata.sql"},executionPhase = ExecutionPhase.BEFORE_TEST_METHOD)
@ActiveProfiles("test")//switching database 
public class SquadControllerIntergrationTest {
	
@Autowired	
private MockMvc mvc;

@Autowired
private ObjectMapper mapper; // Used for converting objects to JSON

@Test
public void createTest() throws Exception {
	// Create an object for posting
	Squad entry = new Squad("harry", "kane","Forward","test.com",29);
	String entryAsJSON = mapper.writeValueAsString(entry);
	
	// Create an object for checking the result
	Squad result = new Squad(2L,"harry", "kane","Forward","test.com",29);
	String resultAsJSON = mapper.writeValueAsString(result);
	
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
	
	mvc.perform(get("/squad/getAll")
			.contentType(MediaType.APPLICATION_JSON))
			.andExpect(content().json(resultAsJSON));
	
}

@Test
public void getByIdTest() throws Exception {
	
	Squad result = new Squad(1L,"lux","puvan","Defender","test.com",29);
	String resultAsJSON = mapper.writeValueAsString(result);
	
	
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
	
	mvc.perform(get("/squad/getByFirstName/lux")
			.contentType(MediaType.APPLICATION_JSON))
			.andExpect(status().isOk()).andExpect(content().json(resultAsJSON));

}
@Test
public void getByLastNameTest() throws Exception {
	List <Squad> result = new ArrayList<>();
	result.add(new Squad(1L,"lux","puvan","Defender","test.com",29));
	String resultAsJSON = mapper.writeValueAsString(result);
	
	mvc.perform(get("/squad/getByLastName/puvan")
			.contentType(MediaType.APPLICATION_JSON))
			.andExpect(status().isOk()).andExpect(content().json(resultAsJSON));
			
}

@Test
public void updateTest() throws Exception {
	
	Squad update = new Squad(1L,"harry","puvan","Defender","test.com",29);
	String updateJSON =	mapper.writeValueAsString(update);
	
	Squad result = new Squad(1L,"harry","puvan","Defender","test.com",29);
	String resultAsJSON = mapper.writeValueAsString(result);
	
	mvc.perform(put("/squad/update/1")
			.contentType(MediaType.APPLICATION_JSON)
			.content(updateJSON))
			.andExpect(content().json(resultAsJSON));
	
}

@Test
public void deleteTest() throws Exception {
	mvc.perform(delete("/squad/delete/1")
			.contentType(MediaType.APPLICATION_JSON))
			.andExpect(status().isNoContent());
}


}
