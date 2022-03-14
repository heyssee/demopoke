package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class HeldItems {
	
	public HeldItems() {
	  }
	
	Item item[];

	public Item[] getItem() {
		return item;
	}

	public void setItem(Item[] item) {
		this.item = item;
	}
/*
	@Override
	public String toString() {
		return "held-items{" + "item=" + item + ", quote='" + '\'' + '}';
	}*/
}
