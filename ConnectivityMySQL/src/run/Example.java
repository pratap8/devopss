package run;
import java.sql.*;

public class Example {
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pratapdb","root","singh@1999");
			
			Statement cs = con.createStatement();
			System.out.println("Inserting");
			String sql = "INSERT INTO Persons (name,password,mail)\r\n"
					+ "VALUES ('Lars','Monsen','pass');";
			cs.executeUpdate(sql);
					
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error");
		}
		
	}

}
