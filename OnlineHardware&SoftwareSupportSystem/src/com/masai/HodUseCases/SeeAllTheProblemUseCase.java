package com.masai.HodUseCases;

import java.util.List;

import com.masai.Dao.HodDao;
import com.masai.DaoImplmentation.HodDaoImpl;
import com.masai.Exception.HODException;
import com.masai.Model.Complain;

public class SeeAllTheProblemUseCase {

	
	public static void main(String[] args) {
		
          HodDao dao =new HodDaoImpl();
		
		try {
			List<Complain> pd = dao.CanSeeAllTheProblem();
			if(pd!=null)
				pd.forEach(s -> System.out.println(s));
				
			else
				System.out.println("there are no problems");
					
		} catch (HODException e) {
			
			e.printStackTrace();
		}
	}
}
