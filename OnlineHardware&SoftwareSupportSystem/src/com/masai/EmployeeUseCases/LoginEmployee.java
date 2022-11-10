package com.masai.EmployeeUseCases;

import java.util.Scanner;

import com.masai.Dao.EmployeeDao;
import com.masai.DaoImplmentation.EmployeeDaoImpl;
import com.masai.Exception.EmployeeException;
import com.masai.Model.Employee;

public class LoginEmployee {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Student email/username :");
		String email= sc.next();
		
		System.out.println("Enter Password :");
		String password= sc.next();
		
		
        EmployeeDao dao = new EmployeeDaoImpl();
		
		try {
	 	String employee1= dao.Loginemployee(email, password);
		
	 	System.out.println("Welcome "+employee1);
	 	
	 
	 	
		}catch (EmployeeException e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
		

	}
}
