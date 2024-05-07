package service;

import java.util.ArrayList;
import java.util.List;

import dao.RestaurantDao;
import dao.UserDao;
import modal.Restaurant;
import strategy.PriceStrategy;
import strategy.RatingStrategy;
import strategy.RestaurantDisplayStrategy;

public class ZodamtoRestaurantServiceImpl implements ZodamtoRestaurantService {
	
	RestaurantDao restaurantDao;
	UserDao userDao;
	
	public ZodamtoRestaurantServiceImpl()
	{
		this.restaurantDao = RestaurantDao.getInstance();
		this.userDao = UserDao.getInstance();
		}
	
	@Override
	public void registerRestaurant(String restaurantName, String pincodes, String foodItem , double price , int quantity)
	{
		Restaurant restaurant = new Restaurant(restaurantName, pincodes.split("/"), foodItem, price, quantity);
		restaurantDao.addRestaurant(restaurant);
	}
	
	@Override
	public List<Restaurant> showRestaurant(String sortBy)
	{
		RestaurantDisplayStrategy strategy = null;
		if(sortBy.equals("price"))
		{
			strategy = new PriceStrategy();
		}
		if(sortBy.equals("rating"))
		{
			strategy = new RatingStrategy();
		}
		if(strategy != null)
		{
			return strategy.findRestaurants(restaurantDao.getAllRestaurant(),userDao.getCurrentLoginuser());
		}
		return new ArrayList<>();
		
	}
	
	  @Override
	    public boolean placeOrder(String restaurantName, int quantity) {
	        Restaurant restaurant = restaurantDao.getRestaurant(restaurantName);
	        if (restaurant != null) {
	            return restaurant.placeOrder(quantity);
	        }
	        return false;
	    }
	  
	  @Override
	    public void rateRestaurant(String restaurantName, int rating, String comment) {
	        Restaurant restaurant = restaurantDao.getRestaurant(restaurantName);
	        restaurant.addComments(rating, comment);
	    }
	  @Override
	    public boolean updateQuantity(String restaurantName, int quantityToAdd) {
	        Restaurant restaurant = restaurantDao.getRestaurant(restaurantName);
	        if (restaurant != null) {
	            restaurant.updateQuantity(quantityToAdd);
	            return true;
	        }
	        return false;
	    }
}
