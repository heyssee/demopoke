package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Abilities {
	Ability ability[];
	boolean is_hidden;
	int slot;
	
	/*public Ability[] getAbility() {
		return ability;
	}

	public void setAbility(Ability[] ability) {
		this.ability = ability;
	}*/
	
	public int getSlot() {
		return slot;
	}

	public void setSlot(int slot) {
		this.slot = slot;
	}
	
	public boolean getIs_hidden() {
		return is_hidden;
	}

	public void setIs_hidden(boolean is_hidden) {
		this.is_hidden = is_hidden;
	}
}
