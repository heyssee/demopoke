package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PokeapiModel {
	Abilities abilities[];
	HeldItems held_items[];
	int base_experience;
	int id;
	String name;
	String location_area_encounters;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public int getBase_experience() {
		return base_experience;
	}

	public void setBase_experience(int base_experience) {
		this.base_experience = base_experience;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getLocation_area_encounters() {
		return location_area_encounters;
	}

	public void setLocation_area_encounters(String location_area_encounters) {
		this.location_area_encounters = location_area_encounters;
	}
	
	/*
	 public Abilities[] getAbilities() {
		return abilities;
	}

	public void setAbilities(Abilities[] abilities) {
		this.abilities = abilities;
	}

	 * 
	 * public HeldItems[] getHeld_items() {
		return held_items;
	}

	public void setHeld_items(HeldItems[] held_items) {
		this.held_items = held_items;
	}*/

}
