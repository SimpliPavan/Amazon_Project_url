package project_demo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Amazon_Project {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String dburl = "jdbc:mysql://localhost:3306/Amazon_Products";
		String username = "root";
		String password = "root";
		String query = "select * from Products;";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(dburl, username, password);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		
		while(rs.next()) {
			System.out.print("Sl_No: "+rs.getString("Sl_No")+"\t");
			System.out.print("Brand: "+rs.getString("Brand") +"\t");
			System.out.print("Model_Name: "+rs.getString("Model_Name") +"\t");
			System.out.print("         Price: "  + rs.getString("Price") +  " \t");
			System.out.println();
		}
	}
}
