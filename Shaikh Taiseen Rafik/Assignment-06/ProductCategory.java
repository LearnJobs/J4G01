package Assignment6;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductCategory {
	
	public static void main(String[] args) {
		try{
			
			Connection con=MyConnection.getConnection();
			System.out.println("Connected to database ");
			
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from product where productCategory='garment'");
			while(rs.next()) {
			
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
			
			}
		} catch (ClassNotFoundException e) {
			System.out.println("Driver not configured!! ");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
