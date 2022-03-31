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
			
			Statement st=con.createStatement();//statement object is used to fire the queries 
			ResultSet rs=st.executeQuery("select * from product where productCategory='garment'");
			while(rs.next()) {
			
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
			
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Driver not configured!! ");
			//e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
