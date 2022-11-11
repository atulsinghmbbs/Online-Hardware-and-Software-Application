package com.masai.Dao;

import java.util.List;

import com.masai.Exception.ComplainException;
import com.masai.Exception.EngineerException;
import com.masai.Exception.HODException;
import com.masai.Model.Complain;
import com.masai.Model.Engineer;



public interface HodDao {

	
	public String loginHOd(String email, int password) throws HODException;

	public String registerengineer(Engineer engineer)throws EngineerException;
	
	public List<Engineer> getRegisteredEngdetails () throws HODException;
	
	public String deletedByEngineerName(String engname) throws HODException;
	
	public List<Complain> CanSeeAllTheProblem() throws HODException;
	
	public String AssignproblemEngineer(Complain complain) throws ComplainException;
}