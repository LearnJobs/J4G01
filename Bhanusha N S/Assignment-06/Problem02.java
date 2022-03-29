package com.assignment06;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jdbconnection.DbConnection;

public class Problem02 {
	DbConnection db = new DbConnection();
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;

	public Problem02() {
	}

	public void display_garments(String product_category) {
		con = db.myconnection();
		try {
			ps = con.prepareStatement("select *from product_table where product_category=?");

			ps.setString(1, product_category);
			rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println("product_category: " + rs.getString(2));
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
