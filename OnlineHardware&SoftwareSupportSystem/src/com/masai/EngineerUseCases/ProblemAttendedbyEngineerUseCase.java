package com.masai.EngineerUseCases;

import java.util.List;
import java.util.Scanner;

import com.masai.Dao.EngineerDao;
import com.masai.DaoImplmentation.EngineerDaoImpl;
import com.masai.Exception.EngineerException;
import com.masai.Model.Complain;

public class ProblemAttendedbyEngineerUseCase {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Engineer name");
		String pname = sc.next();
		
		EngineerDao dao = new EngineerDaoImpl();
		try {
			List<Complain> c=dao.problemAttendedbyWhomEngineer(pname);
			
			c.forEach(a->System.out.println(a));
			
			
		} catch (EngineerException e) {
			
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}
}
