package com.masai.DaoImplmentation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.masai.Dao.HodDao;
import com.masai.Utility.DBUtil;

public class HodDaoImpl implements HodDao{

	@Override
	public String loginHOd(String email, int password) {
		
		String message = "Invalid Username or password..";
		
		
		try (Connection conn= DBUtil.provideConnection()){
			
			
			PreparedStatement ps= conn.prepareStatement("select * from HOD where email=? AND password = ?");
			
			
			ps.setString(1, email);
			ps.setInt(2, password);
	
			
			ResultSet rs= ps.executeQuery();
			
			if(rs.next())
			{
				 message="Login Successfully";
			
			}
			
		} catch (SQLException e) {
			
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
		return message;
		
	}

	
}
