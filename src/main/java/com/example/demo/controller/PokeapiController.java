package com.example.demo.controller;

import java.util.Arrays;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.PokeapiModel;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@CrossOrigin("*")
@RestController
@RequestMapping("/pokemon")
public class PokeapiController {
	
	@GetMapping("/id/{nombre}")
	public int getPokemonId(@PathVariable String nombre) throws JsonMappingException, JsonProcessingException{
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.add("user-agent", "Application");
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<>(headers);
		
		PokeapiModel productFound = restTemplate.exchange("https://pokeapi.co/api/v2/pokemon/"+nombre, HttpMethod.GET, entity, PokeapiModel.class).getBody();
		return productFound.getId();
	}	
	
	@GetMapping("/base-experience/{nombre}")
	public int getBaseExperience(@PathVariable String nombre) {
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.add("user-agent", "Application");
		HttpEntity<String> entity = new HttpEntity<>(headers);
		
		PokeapiModel productFound = restTemplate.exchange("https://pokeapi.co/api/v2/pokemon/"+nombre, HttpMethod.GET, entity, PokeapiModel.class).getBody();
		return productFound.getBase_experience();
	}
	
	@GetMapping("/name/{nombre}")
	public String getName(@PathVariable String nombre) {
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.add("user-agent", "Application");
		HttpEntity<String> entity = new HttpEntity<>(headers);
		
		PokeapiModel productFound = restTemplate.exchange("https://pokeapi.co/api/v2/pokemon/"+nombre, HttpMethod.GET, entity, PokeapiModel.class).getBody();
		return productFound.getName();
	}
		
	@GetMapping("/location-area-encounters/{nombre}")
	public String getLocationAreaEncounters(@PathVariable String nombre) {
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.add("user-agent", "Application");
		HttpEntity<String> entity = new HttpEntity<>(headers);
		
		PokeapiModel productFound = restTemplate.exchange("https://pokeapi.co/api/v2/pokemon/"+nombre, HttpMethod.GET, entity, PokeapiModel.class).getBody();
		return productFound.getLocation_area_encounters();
	}
	
	
	@GetMapping("/abilities/{nombre}")
	public String getAbility(@PathVariable String nombre) throws JsonMappingException, JsonProcessingException {
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.add("user-agent", "Application");
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<>(headers);
		
		ResponseEntity<String> result=restTemplate.exchange("https://pokeapi.co/api/v2/pokemon/"+nombre, HttpMethod.GET, entity, String.class);
		ObjectMapper mapper = new ObjectMapper();
		
		return mapper.readTree(result.getBody()).get("abilities").toString();
	}
	
	@GetMapping("/held-items/{nombre}")
	public String getHeldItems(@PathVariable String nombre) throws JsonMappingException, JsonProcessingException{
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.add("user-agent", "Application");
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<String> entity = new HttpEntity<>(headers);
		
		ResponseEntity<String> result=restTemplate.exchange("https://pokeapi.co/api/v2/pokemon/"+nombre, HttpMethod.GET, entity, String.class);
		ObjectMapper mapper = new ObjectMapper();
		
		return mapper.readTree(result.getBody()).get("held_items").toString();
	}
	/**/
	
	@GetMapping("/test")
	public Object getApi() {
		RestTemplate restTemplate = new RestTemplate();
	    ResponseEntity<Object> response = restTemplate.getForEntity("https://www.fruityvice.com/api/fruit/banana", Object.class);
	    return response.getBody();
	    
	}
}



