package dsa.pattern.creational.builder;

public class Client {
	public static void main(String[] args) {

		User user = new User();
		user.setFirstName("Hari");
		user.setLastName("R");

		Address adr = new Address();
		adr.setPinCode(630201);
		adr.setStreet("DVK");
		user.setAddress(adr);

		System.out.println(user);
		/////
		UserDTOBuilder builder = new UserWebDTOBuilder();
		// Client has to provide director with concrete builder
		UserDTO dto = directBuild(builder, user);
		System.out.println(dto);

	}

	/**
	 * This method serves the role of director in builder pattern.
	 */
	private static UserDTO directBuild(UserDTOBuilder builder, User user) {
		return builder.withFirstName(user.getFirstName()).withLastName(user.getLastName()).withAddrss(user.getAddress())
				.build();
	}

}
