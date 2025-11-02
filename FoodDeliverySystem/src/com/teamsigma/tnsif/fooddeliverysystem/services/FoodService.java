package com.teamsigma.tnsif.fooddeliverysystem.services;

import java.util.ArrayList;
import java.util.List;

import com.teamsigma.tnsif.fooddeliverysystem.entities.FoodItem;
import com.teamsigma.tnsif.fooddeliverysystem.entities.Restaurant;

public class FoodService {
	
	private List<Restaurant> restaurants = new ArrayList<>();
	
	public void addRestaurant (Restaurant restaurent) {
		restaurants.add(restaurent);
	}
	
	public List<Restaurant> getRestaurants(){
		return restaurants;
	}
	
	public List<FoodItem> getAllFoodItems(){
		List<FoodItem> allFoodItems= new ArrayList<FoodItem>();
		for (Restaurant restaurant: restaurants) {
			allFoodItems.addAll(restaurant.getMenu());
		}
		return allFoodItems;
	}
	
	public FoodItem findFoodById(int FoodId) {
		FoodItem fi = null;
		for(FoodItem f:getAllFoodItems()) {
			if(f.getId()==FoodId) {
				fi=f;
			}
			}
		return fi;
	}
	
	public Restaurant findRestaurentById(int resId) {
		Restaurant res=null;
		for(Restaurant r:restaurants) {
			if(r.getId()==resId) {
			res=r;	
			}}
	return res;
	}
	
	public void addFoodItemToRestaurant(int restaurantId, int foodItemId) {
		FoodItem fi = findFoodById(foodItemId);
		for(Restaurant r:restaurants) {
			if(r.getId()==restaurantId) {
				r.addFoodItem(fi);
			}
		}
	} 
	public void removeFoodItemFromRestaurant(int restaurantId,int foodItemId) {
		FoodItem fi =findFoodById(foodItemId);
		for(Restaurant r:restaurants) {
			if(r.getId()==restaurantId) {
				r.removeFoodItem(fi);
			}
		}
	}
}
