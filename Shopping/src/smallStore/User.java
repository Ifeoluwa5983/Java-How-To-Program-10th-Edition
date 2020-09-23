package smallStore;

public abstract class User {
	
	private String name;
	private String phoneNumber;
	private String email;
	private Address houseAddress;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Address getHouseAddress() {
		return houseAddress;
	}
	public void setHouseAddress(Address houseAddress) {
		this.houseAddress = houseAddress;
	}
	public abstract void jump();
	@Override
	public String toString() {
		return "User [name=" + name + ", phoneNumber=" + phoneNumber + ", email=" + email + ", houseAddress="
				+ houseAddress + "]";
	}
	
	
	
}
