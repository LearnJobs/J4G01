import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

public class RegisterServlet extends HttpServlet {
	   
	private static final long serialVersionUID = 1L;
	   private static final String query = "INSERT INTO user VALUES (?, ?); ";
	   
	   @Override
	   public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		   
		  String newuserId = req.getParameter("newusername");
		  String newuserPass = req.getParameter("newuserpass");
		  
	      Connection con = null;
	      PreparedStatement ps = null;
	      
	      try {
	        Class.forName("com.mysql.cj.jdbc.Driver");
//	        System.out.println("Driver is Loaded");
	    	 con = DriverManager.getConnection("jdbc:mysql://localhost/userdb","root","root");
//	    	 System.out.println("Connected to db");
	         ps = con.prepareStatement(query);
	         ps.setString(1, newuserId);
	         ps.setString(2, newuserPass);
//	         System.out.println(ps);
//	         int insertcount = ps.executeUpdate();
//	         System.out.println(insertcount+"record inserted");
	         ps.executeUpdate();
	         res.getWriter().append("<h1>Successfully Registered</h1>"+ newuserId);

	      } catch (Exception e) {
	         res.getWriter().append("<h3><a href='Login.html'>Go to Login Page</a></h3>");
	         
	      }
	   }
}