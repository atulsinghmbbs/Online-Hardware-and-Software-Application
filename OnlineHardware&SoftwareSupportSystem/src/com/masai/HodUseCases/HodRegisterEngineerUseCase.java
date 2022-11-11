package com.masai.HodUseCases;

import java.util.Scanner;
import com.masai.Dao.HodDao;
import com.masai.DaoImplmentation.HodDaoImpl;
import com.masai.Exception.EngineerException;
import com.masai.Model.Engineer;

public class HodRegisterEngineerUseCase {

		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			
			System.out.println("Enter Engineer Id :");
			int engid= sc.nextInt();

			System.out.println("Enter Engineer Name:");
			String Engname= sc.next();

			System.out.println("Enter Engineer email/username :");
			String email= sc.next();
			
			System.out.println("Enter Password :");
			String password= sc.next();
			
			System.out.println("Enter Category :");
			String category= sc.next();

			
		    Engineer engineer= new Engineer();
			engineer.setEngid(engid);
			engineer.setEngineerName(Engname);
			engineer.setEmail(email);
			engineer.setPassword(password);
			engineer.setCategory(category);
			
			HodDao dao = new HodDaoImpl();
			
			try {
			String result= dao.registerengineer(engineer);
			
			System.out.println(result);
			
			
			}catch (EngineerException e) {
				System.out.println(e.getMessage());
			}
			
			
		}
	}


