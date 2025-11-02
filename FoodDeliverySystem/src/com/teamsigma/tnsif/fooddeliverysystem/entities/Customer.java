package com.teamsigma.tnsif.fooddeliverysystem.entities;

public class Customer extends User{
	
	private Cart cart = new Cart();

	public Customer(int userId, String username, long contactNo, Cart cart) {
		super(userId, username, contactNo);
		this.cart = cart;
	}

	public Cart getCart() {
		return cart;
	}
	
	
}
