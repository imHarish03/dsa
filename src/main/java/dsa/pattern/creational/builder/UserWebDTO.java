package dsa.pattern.creational.builder;

public class UserWebDTO implements UserDTO {

	private String firstName;
	private String lastName;
	private String address;

	public UserWebDTO(String firstName, String lastName, String address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getAddress() {
		return address;
	}

}
