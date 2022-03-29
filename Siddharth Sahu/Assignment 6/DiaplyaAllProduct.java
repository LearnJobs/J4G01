
//Write a program to display all the records from product table, product table contains,
// product id, productName, product price, product catetory.
package com.assignment_6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DiaplyaAllProduct {

	public static void main(String[] args)  {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver is Loaded");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/productdb","root","root");
			System.out.println("Connected to db");
			
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("Select * from product");
			
			while(rs.next()) {
				System.out.println("Product Id = "+rs.getInt(1)+" Product Name = "+rs.getString(2)+" Product Price = "+rs.getInt(3)+" Product Category = "+rs.getString(4));
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Driver is not Loaded");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
