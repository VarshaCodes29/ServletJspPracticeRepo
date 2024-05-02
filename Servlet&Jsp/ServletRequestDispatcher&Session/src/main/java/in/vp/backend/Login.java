package in.vp.backend;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/login")
public class Login extends HttpServlet{
	
	protected void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{
		String name = req.getParameter("search1");
		
		//req.setAttribute("name","varsha");
		
		HttpSession session = req.getSession();
		session.setAttribute("name","varsha p");
		
		PrintWriter out = res.getWriter();
		out.print("welcome varsha");
		
		
		RequestDispatcher rd = req.getRequestDispatcher("/login.jsp");
		rd.forward(req, res);

		
//		res.sendRedirect("/login.jsp");
		
			
	}

}
