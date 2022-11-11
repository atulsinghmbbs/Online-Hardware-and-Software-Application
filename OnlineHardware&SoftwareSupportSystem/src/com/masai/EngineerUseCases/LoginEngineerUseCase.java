package com.masai.EngineerUseCases;

import java.util.Scanner;
import com.masai.Dao.EngineerDao;
import com.masai.DaoImplmentation.EngineerDaoImpl;
import com.masai.Exception.EngineerException;


public class LoginEngineerUseCase {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Engineer email/username :");
		String email= sc.next();
		
		System.out.println("Enter Password :");
		String password= sc.next();
		
		
       EngineerDao dao = new EngineerDaoImpl();
		
		try {
	 	String engineer= dao.loginEngineer(email, password);
		
	 	System.out.println("Welcome "+engineer);
	 	
	 
	 	
		}catch (EngineerException e) {
			System.out.println(e.getMessage());
		}
		
	
	}
	
}
