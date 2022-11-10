package com.masai.EmployeeUseCases;

import java.util.Scanner;

import com.masai.Dao.EmployeeDao;
import com.masai.DaoImplmentation.EmployeeDaoImpl;
import com.masai.Exception.EmployeeException;
import com.masai.Model.Employee;

public class RegisterEmployeeUseCase {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Employee First Name :");
		String name= sc.next();

		System.out.println("Enter  Last Name:");
		String address= sc.next();

		System.out.println("Enter Student email/username :");
		String email= sc.next();
		
		System.out.println("Enter Password :");
		String password= sc.next();

		
	Employee employee= new Employee();
		employee.setFirsName(name);
		employee.setLastName(address);
		employee.setEmail(email);
		employee.setPassword(password);
		
		EmployeeDao dao = new EmployeeDaoImpl();
		
		try {
		String result= dao.registeremployee(employee);
		
		System.out.println(result);
		
		
		}catch (EmployeeException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
}
