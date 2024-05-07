package dao;

import java.util.HashMap;

import exceptions.UserAlreadyPresent;
import exceptions.UserNotFound;
import modal.User;

public class UserDao {
	
	private static UserDao userDaoInstance = null;
	private HashMap<String,User> userMap;
	private User currentLoginuser;
	
	private UserDao()
	{
		this.userMap = new HashMap<>();
		this.currentLoginuser = null;
	}
	

	public static UserDao getInstance()
	{
		if(userDaoInstance == null)
		{
			userDaoInstance = new UserDao();
		}
		return userDaoInstance;
	}
	
	public void addUser(User user)
	{
		if(userMap.containsKey(user.getPhoneNumber()))
		{
			throw new UserAlreadyPresent("User exist with the same name" +user.getName());
		}
		userMap.put(user.getPhoneNumber(), user);
	}
	
	public User getUser(String phoneNumber)
	{
		if(!userMap.containsKey(phoneNumber))
		{
			throw new UserNotFound("User doesn't exist");
		}
		return userMap.get(phoneNumber);
	}

	

	public User getCurrentLoginuser() {
		return currentLoginuser;
	}

	public void setCurrentLoginuser(User currentLoginuser) {
		this.currentLoginuser = currentLoginuser;
	}
}
