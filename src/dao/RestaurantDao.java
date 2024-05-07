package dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import exceptions.RestaurantNotPresent;
import exceptions.RestaurantAlreadyPresent;
import modal.Restaurant;

public class RestaurantDao {
	private static RestaurantDao restaurantDaoInstance = null;
	private HashMap<String, Restaurant> restaurantMap;
	
	private RestaurantDao() {
		this.restaurantMap = new HashMap<>();
	}
	
	public static RestaurantDao getInstance()
	{
		if(restaurantDaoInstance == null)
		{
			restaurantDaoInstance = new RestaurantDao();
		}
		return restaurantDaoInstance;			
	}
	
	public void addRestaurant(Restaurant restaurant)
	{
		if(restaurantMap.containsKey(restaurant.getRestaurantName()))
		{
			throw new RestaurantAlreadyPresent("Restaurant Already present");
		}
		restaurantMap.put(restaurant.getRestaurantName(), restaurant);
	}
	
	public List<Restaurant> getAllRestaurant()
	{
		List<Restaurant> restaurantList = new ArrayList<>();
		for(Map.Entry<String, Restaurant> restaurants : restaurantMap.entrySet())
		{
			restaurantList.add(restaurants.getValue());
		}
		return restaurantList;
	}
	
	 public Restaurant getRestaurant(String restaurantName) {
	        if (!restaurantMap.containsKey(restaurantName)) {
	            throw new RestaurantNotPresent("restaurant Not Present");
	        }
	        return restaurantMap.get(restaurantName);
	    }
	 
	 public List<Restaurant> getListOfRestaurants() {
	        List<Restaurant> list = new ArrayList<>();
	        for (Map.Entry<String, Restaurant> entry : restaurantMap.entrySet()) {
	            list.add(entry.getValue());
	        }
	        return list;
	    }
}
