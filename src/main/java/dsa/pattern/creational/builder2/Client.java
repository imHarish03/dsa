package dsa.pattern.creational.builder2;

import dsa.pattern.creational.builder.Address;
import dsa.pattern.creational.builder.User;
import dsa.pattern.creational.builder2.UserDTO.UserDToBuilder;

public class Client {

	public static User createUser() {
		User user = new User();
		user.setFirstName("Ron");
		user.setLastName("Swanson");
		Address address = new Address();
		address.setStreet("State Street");
		user.setAddress(address);
		return user;
	}

	public static void main(String[] args) {
		User user = createUser();

		// Client has to provide director with concrete builder
		UserDTO dto = directBuild(UserDTO.getBuilder(), user);
		System.out.println(dto);
	}

	/**
	 * This method serves the role of director in builder pattern.
	 */
	private static UserDTO directBuild(UserDToBuilder builder, User user) {
		return builder.withFirstName(user.getFirstName()).withLastName(user.getLastName()).build();
	}

}
