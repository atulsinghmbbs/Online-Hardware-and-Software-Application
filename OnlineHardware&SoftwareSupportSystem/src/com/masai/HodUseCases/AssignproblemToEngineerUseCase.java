package com.masai.HodUseCases;

import java.util.Scanner;

import com.masai.Dao.EmployeeDao;
import com.masai.Dao.HodDao;
import com.masai.DaoImplmentation.EmployeeDaoImpl;
import com.masai.DaoImplmentation.HodDaoImpl;
import com.masai.Exception.ComplainException;
import com.masai.Model.Complain;

public class AssignproblemToEngineerUseCase {
	
	public static void main(String[] args) {
		
		
        Scanner sc = new Scanner(System.in);
       
		System.out.println("Enter complain Engineer");
		String engname = sc.next();
		
		System.out.println("Enter complain Id");
		int complainid = sc.nextInt();
		
	  Complain c = new Complain();
	  c.setComplainengineer(engname);
	  c.setComplainid(complainid);
	  
	  HodDao dao =new HodDaoImpl();
	   
	  EmployeeDao dao1 = new EmployeeDaoImpl();
	  
		try {
			String p = dao.AssignproblemEngineer(c);
			System.out.println(p);
		} catch (ComplainException e) {
			
			e.printStackTrace();
		}
		
		System.out.println();
	}
	    
		
		
 	}


