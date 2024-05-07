package exceptions;

public class RestaurantAlreadyPresent extends RuntimeException {
	
	public RestaurantAlreadyPresent(String message)
	{
		super(message);
	}

}
