package com.tnsif.fooddeliverysystem.services;

import com.tnsif.fooddeliverysystem.entities.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CustomerService {
    private List<Customer> customers = new ArrayList<>();

    public void addCustomer(Customer c) { customers.add(c); System.out.println("Customer created: " + c); }

    public Customer findCustomerById(int id) {
        Optional<Customer> c = customers.stream().filter(x -> x.getUserId() == id).findFirst();
        return c.orElse(null);
    }

    public List<Customer> getCustomers() { return customers; }
}
