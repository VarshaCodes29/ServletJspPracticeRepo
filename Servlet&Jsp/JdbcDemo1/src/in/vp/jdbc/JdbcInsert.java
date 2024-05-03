package in.vp.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcInsert {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
    
        String name ="raj";
        String email="raj@gmail.com";
        String password="raj123";
    	
    	
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","root");
            //PreparedStatement ps = con.prepareStatement("insert into register values('varsha','varsha@gmail.com','varsha123')");
            PreparedStatement ps = con.prepareStatement("insert into register values(?,?,?)");
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3,password);
            int i = ps.executeUpdate();
            if(i>0) {
            	System.out.println("success");
            }
            else {
            	 System.out.println("unsuccessfully.");
            }
            
           
        
        
    }
}
