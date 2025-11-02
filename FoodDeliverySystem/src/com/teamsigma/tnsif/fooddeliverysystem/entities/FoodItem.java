package com.teamsigma.tnsif.fooddeliverysystem.entities;

public class FoodItem {
	
	private int Id;
	private int name;
	private int price;
	
	public FoodItem(int id, int name, int price) {
		super();
		Id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public int getName() {
		return name;
	}

	public void setName(int name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "FoodItem [Id=" + Id + ", name=" + name + ", price=" + price + "]";
	}
	
}
