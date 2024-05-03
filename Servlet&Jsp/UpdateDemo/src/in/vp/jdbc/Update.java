package in.vp.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		String password="raj143";
		String email="raj@gmail.com";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","root");
		PreparedStatement ps = con.prepareStatement("update register set password=? where email =?");
		ps.setString(1, password);
		ps.setString(2, email);
		
		int i = ps.executeUpdate();
		
		if(i>0) {
			System.out.println("Update was successful...");
		}
		else
		{
			System.out.println("Not able to update");
		}
	con.close();

	}

}
