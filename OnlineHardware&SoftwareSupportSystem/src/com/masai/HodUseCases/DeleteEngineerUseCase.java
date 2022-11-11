package com.masai.HodUseCases;

import java.util.Scanner;

import com.masai.Dao.HodDao;
import com.masai.DaoImplmentation.HodDaoImpl;
import com.masai.Exception.HODException;

public class DeleteEngineerUseCase {

	public static void main(String[] args) {
		
	    Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter Engineer name");
			String engname = sc.next();
		
			
			HodDao dao =new HodDaoImpl();
			
			try {
				String eng = dao.deletedByEngineerName(engname);
				System.out.println(eng);
			} catch (HODException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
			
			
		}
}
