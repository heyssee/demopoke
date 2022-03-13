package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PokeapiModel {
	Abilities abilities[];
	int base_experience;
	int id;

	public Abilities[] getAbilities() {
		return abilities;
	}

	public void setAbilities(Abilities[] abilities) {
		this.abilities = abilities;
	}

	public int getId() {
		return id;
	}

	public void setIdt(int id) {
		this.id = id;
	}
}
