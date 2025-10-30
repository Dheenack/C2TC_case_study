package com.tnsif.fooddeliverysystem.services;

import com.tnsif.fooddeliverysystem.entities.Restaurant;
import com.tnsif.fooddeliverysystem.entities.FoodItem;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FoodService {
    private List<Restaurant> restaurants = new ArrayList<>();

    public void addRestaurant(Restaurant r) { restaurants.add(r); }

    public Restaurant findRestaurantById(int id) {
        Optional<Restaurant> r = restaurants.stream().filter(x -> x.getId() == id).findFirst();
        return r.orElse(null);
    }

    public List<Restaurant> getRestaurants() { return restaurants; }

    public void viewRestaurantsAndMenus() {
        if (restaurants.isEmpty()) {
            System.out.println("No restaurants available.");
            return;
        }
        System.out.println("Restaurants and menus:");
        for (Restaurant r : restaurants) {
            System.out.println("Restaurant ID:"+r.getId()+"  Name:"+r.getName());
            System.out.println(r.getMenu());
        }
    }

    // convenience for demo: find a food item across restaurants by id
    public FoodItem findFoodItemAcrossRestaurants(int foodId) {
        for (Restaurant r : restaurants) {
            FoodItem f = r.findFoodById(foodId);
            if (f != null) return f;
        }
        return null;
    }
}

