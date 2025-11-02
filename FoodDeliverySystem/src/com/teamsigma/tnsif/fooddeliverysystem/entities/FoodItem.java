package com.teamsigma.tnsif.fooddeliverysystem.entities;

public class FoodItem {
	
	private int Id;
	private String name;
	private int price;
	
	public FoodItem(int id, String fname, int price) {
		super();
		Id = id;
		this.name = fname;
		this.price = price;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
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
		return "- Food Item Id=" + Id + ", name=" + name + ", price=" + price + "\n";
	}
	
}
