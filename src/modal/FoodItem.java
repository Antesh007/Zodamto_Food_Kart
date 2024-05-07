package modal;

public class FoodItem {
	 String name;
	 int quantity;
	 double price;
	
	public FoodItem(String name, int quantity, double price)
	{
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}
	
	public FoodItem(String name) {
        this.name = name;
        this.price = 0.0;
        this.quantity = 0;
    }
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
