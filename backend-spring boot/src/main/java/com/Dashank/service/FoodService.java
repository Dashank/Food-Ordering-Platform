package com.Dashank.service;

import java.util.List;

import com.Dashank.Exception.FoodException;
import com.Dashank.Exception.RestaurantException;
import com.Dashank.model.Category;
import com.Dashank.model.Food;
import com.Dashank.model.Restaurant;
import com.Dashank.request.CreateFoodRequest;

public interface FoodService {

	public Food createFood(CreateFoodRequest req,Category category,
						   Restaurant restaurant) throws FoodException, RestaurantException;

	void deleteFood(Long foodId) throws FoodException;
	
	public List<Food> getRestaurantsFood(Long restaurantId,
			boolean isVegetarian, boolean isNonveg, boolean isSeasonal,String foodCategory) throws FoodException;
	
	public List<Food> searchFood(String keyword);
	
	public Food findFoodById(Long foodId) throws FoodException;

	public Food updateAvailibilityStatus(Long foodId) throws FoodException;
}