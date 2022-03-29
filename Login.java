// Write a program to input username and password and check if that combination is available
//     in the given table.


package com.assignment_6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Login {

	public static void main(String[] args)  {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver is Loaded");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/productdb","root","root");
			System.out.println("Connected to db");
			
			String username = "Siddharth";
			String password = "siddharth123";
			
			String query = "Select Username , Password from login where Username= ? AND Password = ?";
			
			PreparedStatement pst = con.prepareStatement(query);
			pst.setString(1, username);
			pst.setString(2, password);
			
			ResultSet rs = pst.executeQuery();
			
			if(rs.next()) {
				System.out.println("Valid Credentials");
			}else
				System.out.println("Invalid Credentials");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Driver is not Loaded");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
