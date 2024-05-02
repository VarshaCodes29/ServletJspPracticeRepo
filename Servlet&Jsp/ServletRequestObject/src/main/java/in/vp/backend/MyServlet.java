package in.vp.backend;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/aaa")
public class MyServlet extends HttpServlet {
	
	protected void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		String name = req.getParameter("name");
		String password = req.getParameter("password");
		PrintWriter out = res.getWriter();
		out.println("I am in the Servlet page");
		out.println("Welcome "+name);
		out.println("password : "+password);
	}

}
