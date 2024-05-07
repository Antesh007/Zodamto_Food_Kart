package service;

import dao.UserDao;
import enums.Gender;
import modal.User;

public class ZodamtoUserServiceImpl implements ZodamtoUserService {
	
	UserDao userDao;
	
	public ZodamtoUserServiceImpl()
	{
		this.userDao = UserDao.getInstance();
	}
	
	@Override
	public void registerUser(String name, String gender, String phoneNumber, String pincode)
	{
		User user = new User(name, phoneNumber, pincode, gender.toLowerCase().equals("male") ? Gender.MALE : Gender.FEMALE);
		userDao.addUser(user);
	}
	
	@Override
	public boolean loginUser(String phoneNumber)
	{
		User user = userDao.getUser(phoneNumber);
		if(user != null)
		{
			userDao.setCurrentLoginuser(user);
			return true;
		}
		return false;
	}

}
