package com.masai.Dao;


import java.util.List;

import com.masai.Exception.EngineerException;
import com.masai.Model.Complain;
import com.masai.Model.Engineer;

public interface EngineerDao {

	public String loginEngineer(String email , String Password) throws EngineerException; 
	
	public String UpdateproblemStatus(Complain complain) throws EngineerException; 
	
	public List<Complain> problemAttendedbyWhomEngineer(String Engname) throws EngineerException;
	
	public String EngineerChangePassword(Engineer engineer) throws EngineerException;
}
