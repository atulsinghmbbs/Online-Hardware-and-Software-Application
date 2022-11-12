package com.masai.Dao;

import java.util.List;

import com.masai.Exception.ComplainException;
import com.masai.Exception.EmployeeException;
import com.masai.Exception.EngineerException;
import com.masai.Model.Complain;
import com.masai.Model.Employee;
import com.masai.Model.Engineer;

public interface EmployeeDao {

	public String registeremployee(Employee employee)throws EmployeeException;
	
	public String Loginemployee(String email , String password)throws EmployeeException;
	
	public String registerComplain(Complain complain)throws ComplainException;
	
	public String CheckComplainStatus(int cid) throws ComplainException;
	
	public List<Complain> CheckComplainHistory() throws EmployeeException;
	
	public String EmployeeChangePassword(Employee employee) throws EmployeeException;
}
