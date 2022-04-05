package com.assignment06;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver is loaded");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/learnjobs", "root", "21131");
			System.out.println("Connected to database");

			String query = "select*from Product where productCategory =?"; 
			PreparedStatement pst = con.prepareStatement(query);			
			pst.setString(1, "garments");
			ResultSet rs = pst.executeQuery();
			
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " "+rs.getDouble(3)+ " " + rs.getString(4));
			}

		} catch (ClassNotFoundException e) {
			System.out.println("Driver not configured!!");
			// e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();

		}

	}

}


