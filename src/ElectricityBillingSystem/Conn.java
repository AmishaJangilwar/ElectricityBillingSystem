package ElectricityBillingSystem;
import java.sql.*;
public class Conn {
  Connection c;
  Statement s;
	Conn() throws ClassNotFoundException {
		try {
	         Class.forName("com.mysql.cj.jdbc.Driver"); 
			c=DriverManager.getConnection("jdbc:mysql://localhost:3306/ebs","root","Abhiami");
			s=c.createStatement();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
		
}
