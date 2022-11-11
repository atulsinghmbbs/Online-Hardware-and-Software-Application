package com.masai.EmployeeUseCases;


import java.util.Scanner;

import com.masai.Dao.EmployeeDao;
import com.masai.DaoImplmentation.EmployeeDaoImpl;
import com.masai.Exception.ComplainException;

public class CheckComplainStatusUseCase {
	
      public static void main(String[] args) {
    	  
    	  Scanner sc = new Scanner(System.in);
			System.out.println("Enter complain id");
			int cid = sc.nextInt();
			
		     EmployeeDao dao = new EmployeeDaoImpl();
		     

			try {
				System.out.println(dao.CheckComplainStatus(cid));
				
			} catch (ComplainException e) {
				
				System.out.println(e.getMessage());
				e.printStackTrace();
			}

		}
    	
   }
   


