package in.vp.backend;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Register extends HttpServlet
{

	@Override
	protected void service(HttpServletRequest request,HttpServletResponse response)
	{
		System.out.println("Hey,i m in the service method of register page ,hhh...");
	}


}
