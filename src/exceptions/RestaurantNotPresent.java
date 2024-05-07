package exceptions;

public class RestaurantNotPresent extends RuntimeException {
    public RestaurantNotPresent(String message) {
        super(message);
    }
}
