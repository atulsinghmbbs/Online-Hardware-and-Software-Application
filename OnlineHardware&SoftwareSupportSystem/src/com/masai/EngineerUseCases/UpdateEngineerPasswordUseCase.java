package com.masai.EngineerUseCases;

import java.util.Scanner;

import com.masai.Dao.EngineerDao;
import com.masai.DaoImplmentation.EngineerDaoImpl;
import com.masai.Exception.EngineerException;
import com.masai.Model.Engineer;


public class UpdateEngineerPasswordUseCase {
	
	
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	     
			System.out.println("Enter Engid");
			int engid = sc.nextInt();
			
			System.out.println("Enter Eng password");
			String Engpassword = sc.next();
			
		  Engineer c = new Engineer();
		  c.setEngid(engid);
		  c.setPassword(Engpassword);
		
		
		  
		  EngineerDao dao =new EngineerDaoImpl();
		   
		
		  
			try {
				String p = dao.EngineerChangePassword(c);
				System.out.println(p);
			} catch (EngineerException e) {
				
				e.printStackTrace();
			}
			
	}
	
}
