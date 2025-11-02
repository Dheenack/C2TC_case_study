package com.teamsigma.tnsif.fooddeliverysystem.services;

import java.util.ArrayList;
import java.util.List;

import com.teamsigma.tnsif.fooddeliverysystem.entities.Customer;

public class CustomerService {
	private List<Customer> customerList= new ArrayList<>();
	
	public void addCustomer(Customer customer) {
		customerList.add(customer);
	}
	
	public Customer getCustmer(int userId) {
		for(Customer c:customerList) {
			if (c.getUserId()==userId) {
				return c;
			}
		}
		return null;
	}
	
	public List<Customer> getCustomers(){
		return customerList;
	}
}
