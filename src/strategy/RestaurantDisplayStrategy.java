package strategy;

import java.util.List;
import modal.Restaurant;
import modal.User;

public interface RestaurantDisplayStrategy {
	
	public List<Restaurant> findRestaurants(List<Restaurant> restaurantList, User currentUser);

}
