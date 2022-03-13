package com.example.demo.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.PokeapiModel;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/pokemon")
public class PokeapiController {
	
	
	

	@GetMapping("/id/{nombre}")
	public int getPokemonId(@PathVariable String nombre) {
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.add("user-agent", "Application");
		HttpEntity<String> entity = new HttpEntity<>(headers);
		
		PokeapiModel productFound = restTemplate.exchange("https://pokeapi.co/api/v2/pokemon/"+nombre, HttpMethod.GET, entity, PokeapiModel.class).getBody();
		return productFound.getId();
	}
	
	
	
	
	
	@GetMapping()
	public String getPokemon(){
		return "acasdsaddsaf";
	}
	
	@GetMapping("/abilities/{nombre}")
	public String getPokemonAbility(@PathVariable String nombre) throws IOException {
		String url = "https://pokeapi.co/api/v2/pokemon/" + nombre;
		RestTemplate restTemplate = new RestTemplate();        
		
		//String pokemon = restTemplate.getForObject(url, String.class);
		//ObjectMapper mapper = new ObjectMapper();
	
		//return mapper.readTree(pokemon).get("abilities").toString();
		return url;
	}
}



