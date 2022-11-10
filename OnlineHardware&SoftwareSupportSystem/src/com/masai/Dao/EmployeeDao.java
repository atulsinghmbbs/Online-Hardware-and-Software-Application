package com.masai.Dao;

import com.masai.Exception.EmployeeException;
import com.masai.Model.Employee;

public interface EmployeeDao {

	public String registeremployee(Employee employee)throws EmployeeException;
	
	public String Loginemployee(String email , String password)throws EmployeeException;
}
