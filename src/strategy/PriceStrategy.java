package strategy;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import modal.Restaurant;
import modal.User;
import util.ZodamtoUtil;

public class PriceStrategy implements RestaurantDisplayStrategy{
	
	@Override
	public List<Restaurant> findRestaurants(List<Restaurant> restaurantList, User currentUser)
	{
		List<Restaurant> list = ZodamtoUtil.getMatchingRestaurant(restaurantList, currentUser);
		Collections.sort(list, new Comparator<Restaurant>() {
			@Override
			public int compare(Restaurant restaurant1, Restaurant restaurant2)
			{
			return Double.compare(restaurant2.getFoodItem().getPrice(), restaurant1.getFoodItem().getPrice());
			}
		});
		return list;
	}

}
