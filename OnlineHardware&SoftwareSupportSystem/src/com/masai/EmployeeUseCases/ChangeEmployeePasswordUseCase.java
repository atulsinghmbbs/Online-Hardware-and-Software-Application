package com.masai.EmployeeUseCases;

import java.util.Scanner;

import com.masai.Dao.EmployeeDao;
import com.masai.DaoImplmentation.EmployeeDaoImpl;
import com.masai.Exception.EmployeeException;
import com.masai.Model.Employee;


public class ChangeEmployeePasswordUseCase {

	    public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	     
			System.out.println("Enter Empid");
			int empid = sc.nextInt();
			
			System.out.println("Enter Emp password");
			String Emppassword = sc.next();
			
		  Employee c = new Employee();
		  c.setEmpid(empid);
		  c.setPassword(Emppassword);
		
		
		  
		  EmployeeDao dao =new EmployeeDaoImpl();
		   
		
		  
			try {
				String p = dao.EmployeeChangePassword(c);
				System.out.println(p);
			} catch (EmployeeException e) {
				
				e.printStackTrace();
			}
			
	}
}
