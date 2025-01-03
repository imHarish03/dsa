package dsa.pattern.creational.builder;

public interface UserDTOBuilder {

	UserDTOBuilder withFirstName(String fName);

	UserDTOBuilder withLastName(String lName);

	UserDTOBuilder withAddrss(Address address);

	UserDTO build();

	UserDTO getUserDTO();
}
