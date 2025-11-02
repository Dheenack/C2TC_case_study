package com.teamsigma.tnsif.fooddeliverysystem.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.teamsigma.tnsif.fooddeliverysystem.entities.DeliveryPerson;
import com.teamsigma.tnsif.fooddeliverysystem.entities.FoodItem;
import com.teamsigma.tnsif.fooddeliverysystem.entities.Order;

public class OrderService {
	private List<Order> orders=new ArrayList<>();
	private List<DeliveryPerson> deliveryPeople = new ArrayList<>();
	
	public void placeOrder(Order order) {
		Map<FoodItem, Integer> cart=order.getCustomer().getCart().getItems(); 
		order.setItems(cart);
		orders.add(order);
	}

	public List<Order> getOrders() {
		return orders;
	}
	
	public Order getOrderById(int id) {
		Order o=null;
		for(Order or:orders) {
			if(or.getOrderId()==id) {
				o=or;
			}
		}
		return o;
	}
	
	public void addDeliveryPerson(DeliveryPerson deliveryPerson) {
		deliveryPeople.add(deliveryPerson);
	}

	public List<DeliveryPerson> getDeliveryPeople() {
		return deliveryPeople;
	}
	
	public void assignDeliveryPerson(int orderId, int deliveryPersonId) {
		DeliveryPerson dp=null;
		for(DeliveryPerson d:getDeliveryPeople()) {
			 if(d.getDeliveryPersonId()==deliveryPersonId) {
				 dp=d;
			 }
		}
		for(Order order:orders) {
			if(order.getOrderId()==orderId) {
				order.setDeliveryPerson(dp);
			}
		}
	}
	
	
}
