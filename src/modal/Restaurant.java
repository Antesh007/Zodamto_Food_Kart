package modal;

import java.util.Arrays;
import java.util.HashSet;
import java.util.UUID;

public class Restaurant {
	 String restaurantId;
	String restaurantName;
	HashSet<String> listOfServicePincode;
	FoodItem foodItem;
	Rating ratings;
	
	public Restaurant(String restaurantName, String[] listOfServicePincode, String foodItem, double price, int quantity)
	{
		this.restaurantId = UUID.randomUUID().toString();
		this.restaurantName = restaurantName;
		this.listOfServicePincode = new HashSet<>(Arrays.asList(listOfServicePincode));
		this.foodItem = new FoodItem(foodItem, quantity, price);
		this.ratings = new Rating();
	}
	 public void addComments(int rating, String comment) {
	        ratings.addRatingAndComment(rating,comment);
	    }
	
	public String getRestaurantId() {
		return restaurantId;
	}
	public void setRestaurantId(String restaurantId) {
		this.restaurantId = restaurantId;
	}
	public String getRestaurantName() {
		return restaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	public HashSet<String> getListOfServicePincode() {
		return listOfServicePincode;
	}
	public void setListOfServicePincode(HashSet<String> listOfServicePincode) {
		this.listOfServicePincode = listOfServicePincode;
	}
	public FoodItem getFoodItem() {
		return foodItem;
	}
	public void setFoodItem(FoodItem foodItem) {
		this.foodItem = foodItem;
	}
	public Rating getRating() {
		return ratings;
	}
	public void setRating(Rating rating) {
		this.ratings = rating;
	}
	
	public void updateQuantity(int quantity) {
        this.foodItem.quantity += quantity;
    }
	
	public boolean isLocationServiceable(String pincode)
	{
		return listOfServicePincode.contains(pincode);
	}
	
	public boolean isEnoughQuantityAvailable()
	{
		return this.foodItem.getQuantity() > 0;
	}
	
	 public boolean placeOrder(int quantity) {
	        if (quantity <= this.foodItem.quantity) {
	            this.foodItem.quantity -= quantity;
	            return true;
	        }
	        return false;
	    }
	 
	 public Double getRestaurantRating() {
	        return ratings.getAverageRating();
	    }
	 
	
}
