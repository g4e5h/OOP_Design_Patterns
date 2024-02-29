package com.cpc.dp.builder;

import java.time.LocalDate;
import java.time.LocalDateTime;

//The concrete builder for UserWebDTO

public class UserWebDTOBuilder implements UserDTOBuilder {
	
    private String firstName;
    private String lastName;
    private Address address;
    private LocalDate birthday;
    private UserDTO userDTO;

    public UserDTOBuilder withFirstName(String fname){
        firstName=fname;
        return this;
    }

	public UserDTOBuilder withLastName(String lname){
        lastName=lname;
        return this;
    }

	public UserDTOBuilder withBirthday(LocalDate date){
        birthday=date;  
        return this;
    }

	public UserDTOBuilder withAddress(Address address){
        this.address=address;
        return this;
    }
	//method to "assemble" final product
	public UserDTO build(){
        userDTO= new UserWebDTO(firstName+" "+lastName, address.toString(), birthday.toString());
        return userDTO;
    }
	//(optional) method to fetch already built object
	public UserDTO getUserDTO(){
        return userDTO;
    }
	
}
