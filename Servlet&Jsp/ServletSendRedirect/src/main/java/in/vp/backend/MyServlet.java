package in.vp.backend;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/submitForm")
public class MyServlet extends HttpServlet{
	
	protected void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		String name = req.getParameter("search1");
		
		res.sendRedirect("https://www.google.com/search?q="+name);
		

		

		
	}


}
