package com.masai.Model;

public class Engineer {

	int engid;
	String EngineerName;
	String email;
	String password;
	
	
	
	
	public Engineer() {
		super();
		
	}




	public Engineer(int engid, String engineerName, String email, String password) {
		super();
		this.engid = engid;
		EngineerName = engineerName;
		this.email = email;
		this.password = password;
	}




	public int getEngid() {
		return engid;
	}




	public void setEngid(int engid) {
		this.engid = engid;
	}




	public String getEngineerName() {
		return EngineerName;
	}




	public void setEngineerName(String engineerName) {
		EngineerName = engineerName;
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
		return "Engineer [engid=" + engid + ", EngineerName=" + EngineerName + ", email=" + email + ", password="
				+ password + "]";
	}
	
	
	
	
	
	
	
}
