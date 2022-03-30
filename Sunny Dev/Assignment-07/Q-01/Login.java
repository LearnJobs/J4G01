import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet
{
	protected void dopost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException
	{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		
		String user=req.getParameter("userName");
		String pass=req.getParameter("userPassword");
		
		if(user.contentEquals("sunny")&& pass.contentEquals("12#Sunny"))
			System.out.println("Login Success..");
		else
			System.out.println("Login Failed..");
		
				
	}

}
