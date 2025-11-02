package com.teamsigma.tnsif.fooddeliverysystem.entities;

import java.util.Map;

public class Cart {
		
	private Map<FoodItem,Integer> items;
	
	public Cart() {}
	
	public void addItem (FoodItem foodItem, int quantity) {
			items.put(foodItem, quantity);
	}
	
	public void removeItem(FoodItem foodItem) {
		items.remove(foodItem);
	}
	
	public Map<FoodItem,Integer> getItems(){
		return items;
	}

	@Override
	public String toString() {
		return "Cart [items=" + items + "]";
	}
	
	
}
