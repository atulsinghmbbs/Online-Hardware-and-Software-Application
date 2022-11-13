package com.masai.DaoImplmentation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JList;

import com.masai.Dao.EngineerDao;
import com.masai.Exception.EngineerException;
import com.masai.Model.Complain;
import com.masai.Model.Engineer;
import com.masai.Utility.DBUtil;

public class EngineerDaoImpl implements EngineerDao {

	@Override
	public String loginEngineer(String email, String Password) throws EngineerException {
	       
		
		 String message="NO";
         
			
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

	@Override
	public List<Complain> problemAttendedbyWhomEngineer(String Engname) throws EngineerException {
		
		List<Complain> list = new ArrayList<>();
		
		try(Connection conn = DBUtil.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("select * from complain where complainengineer = ?");
			ps.setString(1, Engname);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				
			  int c = rs.getInt("complainid");
			  String cname = rs.getString("complainname");
			  String Ceng = rs.getString("complainengineer");
			  String Cstatus =rs.getString("complainstatus");
			  
			  Complain c1 = new Complain(c ,cname ,Ceng , Cstatus);
			  list.add(c1);
			  
			}			
			
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return list;
		
	
	}

	@Override
	public String EngineerChangePassword(Engineer engineer) throws EngineerException {
		
         String isUpdated = "your password Updated successfully";
		
		try(Connection conn = DBUtil.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("update Engineer set password = ? where engid = ?");
			
			
			ps.setString(1 , engineer.getPassword());
			ps.setInt(2, engineer.getEngid());
			
			int out = ps.executeUpdate();
			
			if(out > 0) {
				
				isUpdated = "your password Updated successfully";
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		return isUpdated;
		
	}

	@Override
	public List<Complain> EngineerviewProblem(Complain complain) throws EngineerException {
				
		   
		   List<Complain> list = new ArrayList<>();
           try(Connection conn = DBUtil.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("select * from complain where complainengineer = ?");
			ps.setString(1, complain.getComplainengineer());
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				
			  int c = rs.getInt("complainid");
			  String cname = rs.getString("complainname");
			  String Ceng = rs.getString("complainengineer");
			  String Cstatus =rs.getString("complainstatus");
			  
			  Complain c1 = new Complain(c ,cname ,Ceng , Cstatus);
			  list.add(c1);
			  
			}			
			
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return list;
		
		
	}
	


}
