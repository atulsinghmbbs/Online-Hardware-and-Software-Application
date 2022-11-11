package com.masai.DaoImplmentation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.masai.Dao.EmployeeDao;
import com.masai.Exception.ComplainException;
import com.masai.Exception.EmployeeException;
import com.masai.Model.Complain;
import com.masai.Model.Employee;
import com.masai.Utility.DBUtil;

public class EmployeeDaoImpl implements EmployeeDao {
	
	
	String Employee = null;



	@Override
	public String registeremployee(Employee employee) throws EmployeeException {
		
          String result = "Not Inserted..";
		
		try(Connection conn= DBUtil.provideConnection()) {
			
			PreparedStatement ps= conn.prepareStatement("insert into employee(empid,employeename,email,password) values(?,?,?,?)");
			
			ps.setInt(1, employee.getEmpid());
			ps.setString(2, employee.getEmpname());
			ps.setString(3, employee.getEmail());
			ps.setString(4, employee.getPassword());
			
			
			int x= ps.executeUpdate();
			
			if(x >0)
				result = "Employee Registered Sucessfully..";
				
		
		} catch (SQLException e) {
			e.printStackTrace();
			throw new EmployeeException(e.getMessage());
		}
	
		return result;
		
	}

	
	
	@Override
	public String Loginemployee(String email, String password) throws EmployeeException {
		
        String message="Invalid username or password";
         
		
		try (Connection conn= DBUtil.provideConnection()){
			
			
			PreparedStatement ps= conn.prepareStatement("select * from employee where email=? AND password = ?");
			
			
			ps.setString(1, email);
			ps.setString(2, password);
			
			ResultSet rs= ps.executeQuery();
			
			if(rs.next())
			{
			    String e= rs.getString("email");
				String p= rs.getString("password");
				
			 
				 message=rs.getString("FirstName");
			}
			else
				throw new EmployeeException("Invalid Username or password..");
			
		
		} catch (SQLException e) {
			e.printStackTrace();
			throw new EmployeeException(e.getMessage());
		}
		
		
		return message;
		
	}



	@Override
	public String registerComplain(Complain complain) throws ComplainException {
		
		String message = "insertion failed";
		try (Connection conn = DBUtil.provideConnection()){
		
			PreparedStatement ps = conn.prepareStatement("insert into complain (complainname) values(?)");
			
			
			ps.setString(1 , complain.getComplainname());
			
			
			
			int x = ps.executeUpdate();
			if(x>0) 
			return x+ " Complain Registered";
				
			
		} catch (SQLException e) {
			message =e.getMessage();
		}
		
		
	
		
		return message;
	}



	@Override
	public String CheckComplainStatus(int cid) throws ComplainException {
		
          String employee= "Engineer has not assigned";
		
		try(Connection conn= DBUtil.provideConnection()) {
			
			
			PreparedStatement ps = conn.prepareStatement("select complainengineer from complain where complainid = ?");
			
			ps.setInt(1, cid);
			
			ResultSet rs= ps.executeQuery();
			
			if(rs.next()) {
		
				
				employee = rs.getString("complainengineer");
				
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new ComplainException(e.getMessage());
		}
	
		
		return employee; 
		
		
	}

}
