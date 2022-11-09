package com.masai.Model;

public class HOD {

    String email;
    int password;
    String Category;
	
    
    
    
    
    public HOD() {
		super();
		// TODO Auto-generated constructor stub
	}

   
    public HOD(String email, int password, String category) {
		super();
		this.email = email;
		this.password = password;
		Category = category;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getPassword() {
		return password;
	}


	public void setPassword(int password) {
		this.password = password;
	}


	public String getCategory() {
		return Category;
	}


	public void setCategory(String category) {
		Category = category;
	}


	@Override
	public String toString() {
		return "HOD [email=" + email + ", password=" + password + ", Category=" + Category + "]";
	}
    
    
    
    
    
    
}
