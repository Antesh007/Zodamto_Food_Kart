package service;

import java.util.List;

import modal.Restaurant;

public interface ZodamtoRestaurantService {
	
	void registerRestaurant(String restaurantName, String pincodes, String fooditem , double price , int quantity);
	
	List<Restaurant> showRestaurant(String sortBy);
	
	 boolean placeOrder(String restaurantName, int quantity);
	 
	void rateRestaurant(String restaurantName, int rating, String comment);
	     
	boolean updateQuantity(String restaurantName, int quantityToAdd);
	     
}
