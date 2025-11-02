package com.teamsigma.tnsif.fooddeliverysystem.entities;

import java.util.Map;

public class Order {
	private int orderId;
	private Customer customer;
	private Map<FoodItem,Integer> items;
	private String status = "pending";
	
	private DeliveryPerson deliveryPerson;
	private String deliveryAddress;
	public Order(int orderId, Customer customer) {
		super();
		this.orderId = orderId;
		this.customer = customer;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Map<FoodItem, Integer> getItems() {
		return items;
	}
	public void setItems(Map<FoodItem, Integer> items) {
		this.items = items;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public DeliveryPerson getDeliveryPerson() {
		return deliveryPerson;
	}
	public void setDeliveryPerson(DeliveryPerson deliveryPerson) {
		this.deliveryPerson = deliveryPerson;
	}
	public String getDeliveryAddress() {
		return deliveryAddress;
	}
	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", customer=" + customer + ", items=" + items + ", status=" + status
				+ ", deliveryPerson=" + deliveryPerson + ", deliveryAddress=" + deliveryAddress + "]";
	}
	
	public void addItem(FoodItem fi, int id	) {
		items.put(fi, id);
	}
	 
	
}
