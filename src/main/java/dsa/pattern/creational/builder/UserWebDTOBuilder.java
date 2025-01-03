package dsa.pattern.creational.builder;

public class UserWebDTOBuilder implements UserDTOBuilder {

	private String firstName;
	private String lastName;
	private String addressInfo;

	private UserWebDTO webDTO;

	@Override
	public UserDTOBuilder withFirstName(String fName) {
		this.firstName = fName;
		return this;
	}

	@Override
	public UserDTOBuilder withLastName(String lName) {
		this.lastName = lName;
		return this;
	}

	@Override
	public UserDTO build() {
		webDTO = new UserWebDTO(firstName, lastName,addressInfo);
		return webDTO;
	}

	@Override
	public UserDTO getUserDTO() {
		return webDTO;
	}

	@Override
	public UserDTOBuilder withAddrss(Address address) {
		this.addressInfo = address.getStreet().concat(" ").concat(String.valueOf(address.getPinCode()));
		return this;
	}

}
