package dsa.pattern.creational.builder2;

public class UserDTO {

	private String firstName;
	private String lastName;
	private String address;

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getAddress() {
		return address;
	}

	private void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	private void setLastName(String lastName) {
		this.lastName = lastName;
	}

	private void setAddress(String address) {
		this.address = address;
	}

	public static UserDToBuilder getBuilder() {
		return new UserDToBuilder();

	}

	public static class UserDToBuilder {

		private String firstName;
		private String lastName;
		private UserDTO userDTO;

		public UserDToBuilder withFirstName(String firstName) {
			this.firstName = firstName;
			return this;
		}

		public UserDToBuilder withLastName(String lastName) {
			this.firstName = lastName;
			return this;
		}

		public UserDTO build() {
			userDTO = new UserDTO();
			userDTO.setFirstName(this.firstName);
			userDTO.setLastName(this.lastName);

			return userDTO;
		}

	}

}
