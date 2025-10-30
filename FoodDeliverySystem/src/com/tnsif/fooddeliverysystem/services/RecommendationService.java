package com.tnsif.fooddeliverysystem.services;

import com.tnsif.fooddeliverysystem.entities.*;

import java.util.*;
import java.util.stream.Collectors;

public class RecommendationService {

    // Simple frequency-based recommender (cuisine-level)
    public List<FoodItem> recommend(Customer customer, List<Restaurant> restaurants) {
        if (customer.getOrderHistory().isEmpty()) {
            // cold start: top priced items
            return restaurants.stream().flatMap(r -> r.getMenu().stream())
                    .sorted(Comparator.comparingDouble(FoodItem::getPrice).reversed())
                    .limit(5)
                    .collect(Collectors.toList());
        }

        

      

        List<FoodItem> recs = new ArrayList<>();
        return recs.stream().limit(5).collect(Collectors.toList());
    }

    public void showRecommendations(Customer c, List<Restaurant> restaurants) {
        List<FoodItem> recs = recommend(c, restaurants);
        System.out.println("\nRecommendations for " + c.getUsername() + ":");
        if (recs.isEmpty()) System.out.println("  Try something new today!");
        else recs.forEach(fi -> System.out.println("  -> " + fi));
    }
}
