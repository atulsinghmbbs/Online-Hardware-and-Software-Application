package com.masai.Utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBUtil {

     public static Connection provideConnection() {
			
			Connection conn = null;
			
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			}
			
			
			String url= "jdbc:mysql://localhost:3306/Hardware_and_software";
			
			try {
				conn = DriverManager.getConnection(url, "root", "atul@0455");
			} catch (SQLException e) {
			
				e.printStackTrace();
			}
			
		
			return conn;
		
     }
     
}
