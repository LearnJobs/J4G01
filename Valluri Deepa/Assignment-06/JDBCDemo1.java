import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver is loaded");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/product", "root", "dimple");
			System.out.println("Connected to database");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select *from ptable");
			
			while (rs.next()) {
				System.out.println("pid: " +  rs.getInt(1) + "   " +"pname: " + rs.getString(2)+"  "+ "category: " + rs.getString(3));
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Driver not configured");
			// e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
