package com.masai.EngineerUseCases;

import java.util.Scanner;

import com.masai.Dao.EngineerDao;
import com.masai.DaoImplmentation.EngineerDaoImpl;
import com.masai.Exception.ComplainException;
import com.masai.Exception.EngineerException;
import com.masai.Model.Complain;

public class UpdateproblemStatus {
	
	public static void main(String[] args) {
		
	
	 Scanner sc = new Scanner(System.in);
     
		System.out.println("Enter complain Status");
		String engname = sc.next();
		
		System.out.println("Enter complain Id");
		int complainid = sc.nextInt();
		
	  Complain c = new Complain();
	  c.setComplainstatus(engname);
	  c.setComplainid(complainid);
	
	
	  
	  EngineerDao dao =new EngineerDaoImpl();
	   
	 // EmployeeDao dao1 = new EmployeeDaoImpl();
	  
		try {
			String p = dao.UpdateproblemStatus(c);
			System.out.println(p);
		} catch (EngineerException e) {
			
			e.printStackTrace();
		}
		
		System.out.println();

}
}
