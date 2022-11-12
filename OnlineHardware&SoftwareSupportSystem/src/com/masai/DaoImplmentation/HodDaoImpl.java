package com.masai.DaoImplmentation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.masai.Dao.HodDao;
import com.masai.Exception.ComplainException;
import com.masai.Exception.EmployeeException;
import com.masai.Exception.EngineerException;
import com.masai.Exception.HODException;
import com.masai.Model.Complain;
import com.masai.Model.Engineer;
import com.masai.Utility.DBUtil;

public class HodDaoImpl implements HodDao{

	@Override
	public boolean loginHOd(String email, int password) {
		
		String message = "Invalid Username or password..";
		
		
		try (Connection conn= DBUtil.provideConnection()){
			
			
			PreparedStatement ps= conn.prepareStatement("select * from HOD where email=? AND password = ?");
			
			
			ps.setString(1, email);
			ps.setInt(2, password);
	
			
			ResultSet rs= ps.executeQuery();
			
			if(rs.next())
			{
				 message="Login Successfully";
				  return true;
			
			}
			
		} catch (SQLException e) {
			
			System.out.println(e.getMessage());
			//e.printStackTrace();
			
		}
		
		
		//return message;
		return false;
		
		
	}

	@Override
	public String registerengineer(Engineer engineer) throws EngineerException {
		
		   String result = "Not Inserted..";
			
			try(Connection conn= DBUtil.provideConnection()) {
				
				PreparedStatement ps= conn.prepareStatement("insert into engineer(engid,engineername,email,password,category) values(?,?,?,?,?)");
				
				ps.setInt(1, engineer.getEngid());
				ps.setString(2, engineer.getEngineerName());
				ps.setString(3, engineer.getEmail());
				ps.setString(4, engineer.getPassword());
				ps.setString(5, engineer.getCategory());
				
				
				int x= ps.executeUpdate();
				
				if(x >0)
					result = "Engineer Registered Sucessfully..";
					
			
			} catch (SQLException e) {
				e.printStackTrace();
				throw new EngineerException(e.getMessage());
			}
		
			return result;
			
	}

	@Override
	public List<Engineer> getRegisteredEngdetails() throws HODException {

		List<Engineer> list = new ArrayList<>();
		
		try (Connection conn = DBUtil.provideConnection()){
			
			PreparedStatement rs = conn.prepareStatement("select * from engineer");
			
			ResultSet x = rs.executeQuery();
			
			while(x.next()) {
				int id = x.getInt("engid");
				String n = x.getString("Engineername");
				String p = x.getString("email");
				String q= x.getString("password");
				String c =x.getString("category");
				
				Engineer pd = new Engineer(id , n , p , q ,c);
				list.add(pd);
			}
				
			return list;
			
		} catch (SQLException e) {
			return null;
		}
	
	}

	@Override
	public String deletedByEngineerName(String engname) throws HODException {
		
		String message = "Not Deleted";
		
		
		try (Connection conn = DBUtil.provideConnection()){
		
			PreparedStatement ps = conn.prepareStatement("delete from engineer where engineername = ?");
			
			ps.setString(1 , engname);
			
			
			int x = ps.executeUpdate();
			if(x>0) 
			return x + " Engineer deleted From the system";
		   
			
		} catch (SQLException e) {
			message =e.getMessage();
			e.printStackTrace();
		}
		
		
	     return message;
	
	}

	@Override
	public String AssignproblemEngineer(Complain complain) throws ComplainException {
		
		String isUpdated = "complainengineer is not updated";
		
		try(Connection conn = DBUtil.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("update complain set complainengineer = ? where complainid = ?");
			
			
			ps.setString(1, complain.getComplainengineer());
			ps.setInt(2, complain.getComplainid());
			
			int out = ps.executeUpdate();
			
			if(out > 0) {
				
				isUpdated = "complain Engineer has Assigned the Problem";
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		return isUpdated;
		
	}

	
	
	@Override
	public List<Complain> CanSeeAllTheProblem() throws HODException {
		
		
         List<Complain> list = new ArrayList<>();
		
		try (Connection conn = DBUtil.provideConnection()){
			
			PreparedStatement rs = conn.prepareStatement("select * from complain");
			
			ResultSet x = rs.executeQuery();
			
			while(x.next()) {
				int id = x.getInt("complainid");
				String n = x.getString("complainname");
				String p = x.getString("complainengineer");
				String q= x.getString("complainstatus");
				
				Complain pd = new Complain(id , n , p , q);
				list.add(pd);
			}
				
			return list;
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			return null;
		}
		
	}
	
	

	
}
