package com.masai.Model;

public class Employee {

	
	String FirsName;
	String LastName;
	String email;
	String password;
	
	
	
	public Employee() {
		super();
		
	}

   
	public Employee(String firsName, String lastName, String email, String password) {
		super();
		FirsName = firsName;
		LastName = lastName;
		this.email = email;
		this.password = password;
	}


	public String getFirsName() {
		return FirsName;
	}


	public void setFirsName(String firsName) {
		FirsName = firsName;
	}


	public String getLastName() {
		return LastName;
	}


	public void setLastName(String lastName) {
		LastName = lastName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "Engineer [FirsName=" + FirsName + ", LastName=" + LastName + ", email=" + email + ", password="
				+ password + "]";
	}
	
	
	
}
