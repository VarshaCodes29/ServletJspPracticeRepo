package in.vp.backend;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/logout")
public class Logout extends HttpServlet {
	
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{
		HttpSession session = req.getSession();
		session.invalidate();
		
		RequestDispatcher rd = req.getRequestDispatcher("/index.html");
		rd.forward(req,res);
		
	}

}
