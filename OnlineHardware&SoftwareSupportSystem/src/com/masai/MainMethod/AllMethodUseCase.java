package com.masai.MainMethod;

import java.util.Scanner;

import com.masai.Dao.EmployeeDao;
import com.masai.Dao.EngineerDao;
import com.masai.Dao.HodDao;
import com.masai.DaoImplmentation.EmployeeDaoImpl;
import com.masai.DaoImplmentation.EngineerDaoImpl;
import com.masai.DaoImplmentation.HodDaoImpl;
import com.masai.EmployeeUseCases.ChangeEmployeePasswordUseCase;
import com.masai.EmployeeUseCases.CheckComplainStatusUseCase;
import com.masai.EmployeeUseCases.CheckComplaintHistoryUseCase;
import com.masai.EmployeeUseCases.RegisterComplain;
import com.masai.EngineerUseCases.EngineerViewProblemUseCase;
import com.masai.EngineerUseCases.ProblemAttendedbyEngineerUseCase;
import com.masai.EngineerUseCases.UpdateEngineerPasswordUseCase;
import com.masai.EngineerUseCases.UpdateproblemStatus;
import com.masai.Exception.EmployeeException;
import com.masai.Exception.EngineerException;
import com.masai.Exception.HODException;
import com.masai.HodUseCases.AssignproblemToEngineerUseCase;
import com.masai.HodUseCases.DeleteEngineerUseCase;
import com.masai.HodUseCases.GetListRegisteredEngineers;
import com.masai.HodUseCases.HodRegisterEngineerUseCase;
import com.masai.HodUseCases.SeeAllTheProblemUseCase;

public class AllMethodUseCase {
	
	public static void main(String[] args) {
		startRun();
		
	}

	
	
	public static void startRun() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 For HOD:");
		System.out.println("Enter 2 For Engineer");
		System.out.println("Enter 3 for Employee");
		
		int num=sc.nextInt();
	     switch(num) {
		  
		
		  case 1:
			  
			    System.out.println("Enter Email");
				String email = sc.next();
				
				System.out.println("Enter password");
				int password = sc.nextInt();
				
				
				HodDao dao = new HodDaoImpl();
				
				
				try {
					boolean sc1=dao.loginHOd(email, password);
					System.out.println(sc1);
					if(sc1==true) {
						System.out.println("login successfully");
						startHODwork();
					}else {
						System.out.println("Login failed");
						startRun();
					}
				} catch (HODException e) {
					
					e.printStackTrace();
				}
				
				break;
				
				
		  case 2:
			  
			  
				
				System.out.println("Enter Engineer email:");
				 email= sc.next();
				
				System.out.println("Enter Password :");
				String password1= sc.next();
				
				
				EngineerDao dao1 =  new EngineerDaoImpl();
				
				try {
			 	String engineer= dao1.loginEngineer(email, password1);
				
			 	
			 	
			    if(engineer!="NO") {
			    	System.out.println("Welcome "+engineer);
			    	startEngineerWork();
			    	
			    }
			    else {
			    	System.out.println("Login failed");
					startRun();
			    }
			 	
				}catch (EngineerException e) {
					System.out.println(e.getMessage());
				}
				
				
				
		  case 3: 
			  	System.out.println("Enter 1 for login Existing User");
		  
			  	System.out.println("Enter 2 Registering Employee");
			  	
			  	
			  	int x = sc.nextInt();
			  	
			  	switch(x) {
			  	 case 1: 
			  		 
			  		System.out.println("Enter Employee email/username :");
					 email= sc.next();
					
					System.out.println("Enter Password :");
					 String password2= sc.next();
					
					
			        EmployeeDao dao2 = new EmployeeDaoImpl();
					
					try {
				 	String employee1= dao2.Loginemployee(email, password2);
					
				 	
				 	if(employee1!="NO") {
				 	System.out.println("Welcome "+employee1);
				 	startemployeework();
				 	}
				 	else {
				 		System.out.println("Login failed");
				 	    startRun();
				 	}
					}catch (EmployeeException e) {
						System.out.println(e.getMessage());
						
					}
					

			  	}
		      
	     }
		}
		public static void startHODwork() {
		
		System.out.println("Enter 1 : Register a New Engineer");

		System.out.println("Enter 2 : List of all the Registered Engineers." );
		
		System.out.println("Enter 3 :  Delete any Engineers from the system");
		
		System.out.println("Enter 4   see all the raised problem." );
		
		System.out.println("Enter 5   Assigning problem to Engineer");
		
		Scanner sc = new Scanner(System.in);
		
		int s = sc.nextInt();
		
		
		switch(s) {
		  
		case 1:
			
			HodRegisterEngineerUseCase.main(null);
			startHODwork();
			break;
			
		case 2:
			
			GetListRegisteredEngineers.main(null);
			startHODwork();
			break;
			
		case 3:
			
			DeleteEngineerUseCase.main(null);
			startHODwork();
			break;
			
			
		case 4:
			
			SeeAllTheProblemUseCase.main(null);
			startHODwork();
			break;
			
		case 5:
			
			AssignproblemToEngineerUseCase.main(null);
			startHODwork();
			break;
		}
		
		
	
			
		
	}
		
	     public static void startEngineerWork() {
			
		

		System.out.println("Enter 1 :•Engineer can view the problem assigned to him by HOD .");

		System.out.println("Enter 2 : Update The Status" );
		
		System.out.println("Enter 3 : Problem List");
		
		System.out.println("Enter 4 Engineer Change Password" );
		
		
         Scanner sc = new Scanner(System.in);
		
		int s1 = sc.nextInt();
		
		switch(s1) {
		  
		case 1:
			EngineerViewProblemUseCase.main(null);
			startEngineerWork();
			break;
			
		case 2:
			
			UpdateproblemStatus.main(null);
			startEngineerWork();
			break;
			
		case 3:
			
			 ProblemAttendedbyEngineerUseCase.main(null);
			 startEngineerWork();
			break;
			
			
		case 4:
			
			 UpdateEngineerPasswordUseCase.main(null);
			 startEngineerWork();
			  break;
		
		
		}
		
		

    }
	     
	     public static void startemployeework() {
				
	    	 
	    	 System.out.println("Enter 1 :Register Complain");

	 		System.out.println("Enter 2 : Complain Status" );
	 		
	 		System.out.println("Enter 3 : Complain History");
	 		
	 		System.out.println("Enter 4   Employee Change Password" );
	 		
	 		
	         Scanner sc = new Scanner(System.in);
	 		
	 		int s1 = sc.nextInt();
	 		
	 		switch(s1) {
	 		  
	 		case 1:
	 			RegisterComplain.main(null);
	 			startemployeework();
	 			break;
	 			
	 		case 2:
	 			
	 			CheckComplainStatusUseCase.main(null);
	 			startemployeework();
	 			break;
	 			
	 		case 3:
	 			
	 			CheckComplaintHistoryUseCase.main(null);
	 			startemployeework();
	 			break;
	 			
	 			
	 		case 4:
	 			
	 			ChangeEmployeePasswordUseCase.main(null);
	 			startemployeework();
	 			  break;
	 		
	 		
	 		}
	 		
		}
}
