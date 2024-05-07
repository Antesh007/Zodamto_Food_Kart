package service;

public interface ZodamtoUserService {
	
	void registerUser(String name, String gender, String phoneNumber, String pincode);
	
	boolean loginUser(String phoneNumber);
}
