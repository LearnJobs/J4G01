package com.assignment06;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import jdbconnection.DbConnection;

/**
 * write a program to display all the records from product table, product table
 * contains product name,id,category
 * 
 */
public class ProductTable01 {

	DbConnection db = new DbConnection();
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;

	public ProductTable01() {
	}

	public void display_products() {
		con = db.myconnection();
		try {
			ps = con.prepareStatement("select *from product_table");
			rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println("product_id: " + rs.getInt(1));
				System.out.println("product_name: " + rs.getString(2));
				System.out.println("product_category: " + rs.getString(3));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			try {
				ps.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
