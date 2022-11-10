package com.masai.Model;

public class Employee {

	
	int empid;
	String empname;
	String email;
	String password;
	
	
	
	public Employee() {
		super();
		
	}



	public Employee(int empid, String empname, String email, String password) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.email = email;
		this.password = password;
	}



	public int getEmpid() {
		return empid;
	}



	public void setEmpid(int empid) {
		this.empid = empid;
	}



	public String getEmpname() {
		return empname;
	}



	public void setEmpname(String empname) {
		this.empname = empname;
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
		return "Employee [empid=" + empid + ", empname=" + empname + ", email=" + email + ", password=" + password
				+ "]";
	}

   
	
	
	
}
