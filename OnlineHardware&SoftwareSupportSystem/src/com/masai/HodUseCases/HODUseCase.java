//package com.masai.HodUseCases;
//
//import java.util.Scanner;
//
//import com.masai.Dao.HodDao;
//import com.masai.DaoImplmentation.HodDaoImpl;
//import com.masai.Exception.HODException;
//
//public class HODUseCase {
//
//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner (System.in);
//		
//		
//		System.out.println("Enter Email");
//		String email = sc.next();
//		
//		System.out.println("Enter password");
//		int password = sc.nextInt();
//		
//		
//		HodDao dao = new HodDaoImpl();
//		
//		
//		try {
//			String sc1=dao.loginHOd(email, password);
//			System.out.println(sc1);
//			
//		} catch (HODException e) {
//			
//			e.printStackTrace();
//		}
//		
//	}
//}
