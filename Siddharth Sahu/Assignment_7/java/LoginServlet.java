import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

public class LoginServlet extends HttpServlet {
	   
	private static final long serialVersionUID = 1L;
	   private static final String query = "SELECT id, pass FROM user WHERE id = ? AND pass = ?";
	   
	   @Override
	   public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		   
		  String userId = req.getParameter("username");
		  String userPass = req.getParameter("userpass");
		  
	      Connection con = null;
	      PreparedStatement ps = null;
	      ResultSet rs = null;
	      boolean flag = false;
	      
	      try {
	        Class.forName("com.mysql.cj.jdbc.Driver");
//	        System.out.println("Driver is Loaded");
	    	 con = DriverManager.getConnection("jdbc:mysql://localhost/userdb","root","root");
//	    	 System.out.println("Connected to db");
	         ps = con.prepareStatement(query);
	         ps.setString(1, userId);
	         ps.setString(2, userPass);
//	         System.out.println(ps);
	         rs = ps.executeQuery();
	         
	    	while(rs.next()) {
	         if (userId.equals(rs.getString("id")) && userPass.equals(rs.getString("pass"))){
	        	 flag = true;
	               res.getWriter().append("<h1>Login Successful</h1>"+ userId);
	            }
	         }
	         
	         if(!flag) {
	            res.getWriter().append("<h1>User Not Found.</h1>");
	            res.getWriter().append("<h3><a href='Login.html'>Login Again</a></h3>");
	         }

	      } catch (Exception e) {
	         res.getWriter().append("<h3><a href='Login.html'>Login Again</a></h3>");
	         
	      }
	   }
}