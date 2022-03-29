//Display the products with the category="garments"

package com.assignment_6;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DisplayProductGarment {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/productdb", "root", "root");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("Select * from product where Category ='Garments' ");
			
			while(rs.next()) {
				System.out.println("Product Id = "+rs.getInt(1)+" Product Name = "+rs.getString(2)+" Product Price = "+rs.getInt(3)+" Product Category = "+rs.getString(4));
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}