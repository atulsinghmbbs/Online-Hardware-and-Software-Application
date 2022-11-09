package com.masai.Dao;

import com.masai.Exception.HODException;
import com.masai.Model.HOD;

//import com.masai.Exception.HODException;

public interface HodDao {

	
	public String loginHOd(String email, int password) throws HODException;

	
}