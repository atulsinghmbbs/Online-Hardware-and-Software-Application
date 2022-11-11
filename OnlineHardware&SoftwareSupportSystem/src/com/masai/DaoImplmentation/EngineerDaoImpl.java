package com.masai.DaoImplmentation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.masai.Dao.EngineerDao;
import com.masai.Exception.EngineerException;
import com.masai.Model.Complain;
import com.masai.Utility.DBUtil;

public class EngineerDaoImpl implements EngineerDao {

	@Override
	public String loginEngineer(String email, String Password) throws EngineerException {
	       
		
		 String message="Invalid username or password";
         
			
			try (Connection conn= DBUtil.provideConnection()){
				
				
				PreparedStatement ps= conn.prepareStatement("select * from engineer where email=? AND password = ?");
				
				
				ps.setString(1, email);
				ps.setString(2, Password);
				
				ResultSet rs= ps.executeQuery();
				
				if(rs.next())
				{
				    String e= rs.getString("email");
					String p= rs.getString("password");
					
				 
					 message=rs.getString("EngineerName");
				}
				else
					throw new EngineerException("Invalid Username or password..");
				
			
			} catch (SQLException e) {
				e.printStackTrace();
				throw new EngineerException(e.getMessage());
			}
			
			
			return message;
			
		
	}

	@Override
	public String UpdateproblemStatus(Complain complain) throws EngineerException {
        
		String isUpdated = "complainengineer is not updated";
		
		try(Connection conn = DBUtil.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("update complain set complainStatus = ? where complainid = ?");
			
			
			ps.setString(1 , complain.getComplainstatus());
			ps.setInt(2, complain.getComplainid());
			
			int out = ps.executeUpdate();
			
			if(out > 0) {
				
				isUpdated = "complain Engineer has Updated the Complain Status";
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		return isUpdated;
		
	}
	


}
