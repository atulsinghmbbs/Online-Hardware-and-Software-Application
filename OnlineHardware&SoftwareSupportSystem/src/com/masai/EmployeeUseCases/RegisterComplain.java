package com.masai.EmployeeUseCases;

import java.util.Scanner;
import com.masai.Dao.EmployeeDao;
import com.masai.DaoImplmentation.EmployeeDaoImpl;
import com.masai.Exception.ComplainException;
import com.masai.Model.Complain;

public class RegisterComplain {

    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter complain name");
		String name = sc.next();
		
		
	    Complain c = new Complain();
	    c.setComplainname(name);
	  
	    EmployeeDao dao =new EmployeeDaoImpl();
	   
		
		try {
			String p = dao.registerComplain(c);
			System.out.println(p);
		} catch (ComplainException e) {
			
			e.printStackTrace();
		}
		
		System.out.println();
	}
	
}
