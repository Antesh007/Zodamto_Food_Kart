package modal;

import enums.Gender;

public class User {

	private String name;
	private String phoneNumber;
	private String pincode;
	private Gender gender;
	
	
	public User(String name, String phoneNumber, String pincode, Gender gender) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.pincode = pincode;
		this.gender = gender;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	/**
	 * @return the pincode
	 */
	public String getPincode() {
		return pincode;
	}
	/**
	 * @param pincode the pincode to set
	 */
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	/**
	 * @return the gender
	 */
	public Gender getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(Gender gender) {
		this.gender = gender;
	}

}
