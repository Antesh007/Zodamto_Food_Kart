package util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import modal.Restaurant;
import modal.User;

public class ZodamtoUtil {
	
	public static List<Restaurant> getMatchingRestaurant(List<Restaurant> restaurantList, User currentUser)
	{
		List<Restaurant> list = new ArrayList<>(restaurantList);
		Iterator iterator = list.iterator();
		while(iterator.hasNext())
		{
			Restaurant restaurant = (Restaurant) iterator.next();
			if(!restaurant.isLocationServiceable(currentUser.getPincode()) && restaurant.isEnoughQuantityAvailable())
			{
				iterator.remove();
			}
		}
		return list;
	}

}
