package com.masai.EmployeeUseCases;

import java.util.List;

import com.masai.Dao.EmployeeDao;
import com.masai.DaoImplmentation.EmployeeDaoImpl;
import com.masai.Exception.EmployeeException;
import com.masai.Model.Complain;


public class CheckComplaintHistoryUseCase {
	
	public static void main(String[] args) {
		
		EmployeeDao dao = new EmployeeDaoImpl();
		try {
			List<Complain> c=dao.CheckComplainHistory();
			
			c.forEach(a->System.out.println(a));
			
			
		} catch (EmployeeException e) {
			
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
