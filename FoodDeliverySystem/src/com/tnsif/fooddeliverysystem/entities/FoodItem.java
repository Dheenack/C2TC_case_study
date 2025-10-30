package com.tnsif.fooddeliverysystem.entities;

import java.util.Objects;

public class FoodItem {
    private int id;
    private String name;
    private double price;

    public FoodItem(int id, String name, double price) {
        this.id = id;
        this.name = name;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }


    @Override
    public String toString() {
        return String.format("FoodItem{id=%d, name='%s', price=₹%.2f}", id, name, price);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FoodItem)) return false;
        FoodItem foodItem = (FoodItem) o;
        return id == foodItem.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

