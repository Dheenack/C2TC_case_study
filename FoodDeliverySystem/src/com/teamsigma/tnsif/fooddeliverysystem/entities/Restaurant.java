package com.teamsigma.tnsif.fooddeliverysystem.entities;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
	private int Id;
	private String name;
	private List<FoodItem> menu=new ArrayList<>();
	
	public Restaurant(int id, String name) {
		super();
		Id = id;
		this.name = name;
	}

	public int getId() {
		return Id;
	}

	public String getName() {
		return name;
	}

	public List<FoodItem> getMenu() {
		return menu;
	}

	@Override
	public String toString() {
		return "Restaurant ID:"+Id+ ", Name:"+name
				+"\n" + menu;
	}
	
	public void addFoodItem(FoodItem fi) {
		menu.add(fi);
	}
	
	public void removeFoodItem(FoodItem fi) {
		menu.remove(fi);
	}
	
}

