package com.cpc.dp.builder;

import java.time.LocalDate;

//This is our client which also works as "director"
public class Client {

	public static void main(String[] args) {
		User user=createUser();     //mocking a user from persistance
		UserDTO dto = directorBuild(new UserWebDTOBuilder(), user);
		System.out.println(dto);
	}

	private static UserDTO directorBuild(UserDTOBuilder userWebDTOBuilder, User user){
		return userWebDTOBuilder.withFirstName(user.getFirstName()).withLastName(user.getLastName())
		.withAddress(user.getAddress()).withBirthday(user.getBirthday()).build();
	}
	
	/**
	 * Returns a sample user. 
	 */
	public static User createUser() {
		User user = new User();
		user.setBirthday(LocalDate.of(1960, 5, 6));
		user.setFirstName("Ron");
		user.setLastName("Swanson");
		Address address = new Address();
		address.setHouseNumber("100");
		address.setStreet("State Street");
		address.setCity("Pawnee");
		address.setState("Indiana");
		address.setZipcode("47998");
		user.setAddress(address);
		return user;
	}
}
